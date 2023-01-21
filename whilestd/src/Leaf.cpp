#include "whilestd/Leaf.h"
#include "whilestd/Node.h"
#include "whilestd/Bool.h"
#include <memory>
#include <string>
#include <iostream>

namespace whilestd {

Leaf::Leaf(const std::string& symbol) : symbol(symbol) {}

Leaf::operator int() const {
    return 0;
}

Leaf::operator bool() const {
    return false;
}

Leaf::operator std::string() const {
    return symbol;
}

BinTreePtr Leaf::operator ==(const BinTree& other) const {
    if (auto otherLeaf = dynamic_cast<const Leaf*>(&other)) {
        return Bool(symbol == otherLeaf->symbol);
    }
    return std::make_unique<Node>();
}

BinTreePtr Leaf::hd() const {
    return std::make_unique<Node>();
}

BinTreePtr Leaf::tl() const {
    return std::make_unique<Node>();
}

BinTreePtr Leaf::clone() const {
    return std::make_unique<Leaf>(symbol);
}

std::ostream& Leaf::pp(std::ostream& os) const {
    return os << symbol;
}

}
