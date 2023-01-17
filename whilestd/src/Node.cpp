#include "whilestd/Node.h"
#include "whilestd/Leaf.h"
#include "whilestd/Bool.h"
#include <memory>
#include <string>
#include <iostream>

namespace whilestd {

Node::Node(BinTreePtr left, BinTreePtr right)
    : left(std::move(left)), right(std::move(right)) {}

Node::operator int() const {
    if(isNil()) {
        return 0;
    }
    return 1 + static_cast<int>(*right);
}

Node::operator bool() const {
    return !isNil();
}

Node::operator std::string() const {
    if(isNil()) {
        return "";
    }
    return static_cast<std::string>(*left) + static_cast<std::string>(*right);
}

BinTreePtr Node::hd() const {
    if(isNil()) {
        return std::make_unique<Node>();
    }
    return std::move(left->clone());
}

BinTreePtr Node::tl() const {
    if(isNil()) {
        return std::make_unique<Node>();
    }
    return std::move(right->clone());
}

BinTreePtr Node::clone() const {
    if(isNil()) {
        return std::make_unique<Node>();
    }
    return std::make_unique<Node>(std::move(left->clone()), std::move(right->clone()));
}

BinTreePtr Node::operator ==(const BinTree& other) const {
    if (auto otherNode = dynamic_cast<const Node*>(&other)) {
        if (isNil()) {
            return std::move(Bool(otherNode->isNil()));
        }
        return std::move(Bool(!otherNode->isNil()
            && *(*left == *otherNode->left)
            && *(*right == *otherNode->right)));
    }
    return std::make_unique<Node>();
}

std::ostream& Node::pp(std::ostream& os) const {
    bool printed = false;
    if(isNil()) {
        os << "nil";
        printed = true;
    }
    else if (auto leftLeaf = dynamic_cast<const Leaf*>(left.get())) {
        if (static_cast<std::string>(*leftLeaf) == "int") {
            os << static_cast<int>(*right);
            printed = true;
        }
        else if (static_cast<std::string>(*leftLeaf) == "bool") {
            os << std::boolalpha << static_cast<bool>(*right);
            printed = true;
        }
        else if (static_cast<std::string>(*leftLeaf) == "string") {
            os << static_cast<std::string>(*right);
            printed = true;
        }
    }
    if (!printed) {
        os << "(cons " << *left << " "  << *right << ")";
    }
    return os;
}

}
