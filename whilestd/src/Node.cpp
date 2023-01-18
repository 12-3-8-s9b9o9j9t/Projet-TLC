#include "whilestd/Node.h"
#include "whilestd/Leaf.h"
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

bool Node::equals(const BinTreePtr& other) const {
    if (auto otherNode = dynamic_cast<Node*>(other.get())) {
        if (isNil()) {
            return otherNode->isNil();
        }
        return !otherNode->isNil()
            && left == otherNode->left
            && right == otherNode->right;
    }
    return false;
}

std::ostream& Node::pp(std::ostream& os) const {
    bool printed = false;
    if(isNil()) {
        os << "nil";
        printed = true;
    }
    else if (auto leftLeaf = dynamic_cast<Leaf*>(left.get())) {
        if (static_cast<std::string>(*leftLeaf) == "int") {
            return os << static_cast<int>(*right);
            printed = true;
        }
        else if (static_cast<std::string>(*leftLeaf) == "bool") {
            return os << std::boolalpha << static_cast<bool>(*right);
            printed = true;
        }
        else if (static_cast<std::string>(*leftLeaf) == "string") {
            return os << static_cast<std::string>(*right);
            printed = true;
        }
    }
    if (!printed) {
        os << "(cons " << left << " "  << right << ")";
    }
    return os;
}

bool Node::isNil() const {
    return left == nullptr && right == nullptr;
}

}
