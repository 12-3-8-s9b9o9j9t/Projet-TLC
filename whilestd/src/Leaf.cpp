#include "whilestd/Leaf.h"
#include "whilestd/Node.h"
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

std::unique_ptr<BinTree> Leaf::hd() const {
    return std::make_unique<Node>();
}

std::unique_ptr<BinTree> Leaf::tl() const {
    return std::make_unique<Node>();
}

std::unique_ptr<BinTree> Leaf::clone() const {
    return std::make_unique<Leaf>(symbol);
}

std::ostream& Leaf::pp(std::ostream& os) const {
    return os << symbol;
}

bool Leaf::equals(const std::unique_ptr<BinTree>& other) const {
    if (auto otherLeaf = dynamic_cast<Leaf*>(other.get())) {
        return symbol == otherLeaf->symbol;
    }
    return false;
}

}
