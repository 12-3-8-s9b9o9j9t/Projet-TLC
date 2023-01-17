#ifndef WHILESTD_LEAF_H
#define WHILESTD_LEAF_H

#include "whilestd/BinTree.h"
#include <string>

namespace whilestd {

class Leaf : public BinTree {
private:
    const std::string symbol;

public:
    Leaf() = delete;
    Leaf(const std::string& symbol);
    ~Leaf() override = default;

    operator int() const override;
    operator bool() const override;
    operator std::string() const override;
    virtual BinTreePtr operator ==(const BinTree& other) const override;

    BinTreePtr hd() const override;
    BinTreePtr tl() const override;
    BinTreePtr clone() const override;
    std::ostream& pp(std::ostream& os) const override;

};

}

#endif
