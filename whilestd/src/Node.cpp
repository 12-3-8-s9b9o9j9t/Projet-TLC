#include "Node.h"
#include "Leaf.h"
#include <memory>
#include <string>
#include <iostream>

namespace whilestd {

Node::Node(std::unique_ptr<BinTree> left, std::unique_ptr<BinTree> right)
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

std::unique_ptr<BinTree> Node::hd() const {
    if(isNil()) {
        return std::make_unique<Node>();
    }
    return left->clone();
}

std::unique_ptr<BinTree> Node::tl() const {
    if(isNil()) {
        return std::make_unique<Node>();
    }
    return right->clone();
}

std::unique_ptr<BinTree> Node::clone() const {
    if(isNil()) {
        return std::make_unique<Node>();
    }
    return std::make_unique<Node>(left->clone(), right->clone());
}

bool Node::equals(const std::unique_ptr<BinTree>& other) const {
    if (auto otherNode = dynamic_cast<Node*>(other.get())) {
        if (isNil()) {
            return otherNode->isNil();
        }
        return !otherNode->isNil()
            && left->equals(otherNode->left->clone())
            && right->equals(otherNode->right->clone());
    }
    return false;
}

std::ostream& Node::pp(std::ostream& os) const {
    if(isNil()) {
        return os << "nil";
    }
    else if (auto leftLeaf = dynamic_cast<Leaf*>(left.get())) {
        if (static_cast<std::string>(*leftLeaf) == "int") {
            return os << static_cast<int>(*right);
        }
        else if (static_cast<std::string>(*leftLeaf) == "bool") {
            return os << static_cast<bool>(*right);
        }
        else if (static_cast<std::string>(*leftLeaf) == "string") {
            return os << static_cast<std::string>(*right);
        }
    }
    return os << "(cons " << left << " " << right << ")";
}

bool Node::isNil() const {
    return left == nullptr && right == nullptr;
}

}
