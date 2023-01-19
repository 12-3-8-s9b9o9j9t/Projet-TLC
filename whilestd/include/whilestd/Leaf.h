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
    virtual ~Leaf() = default;

    operator int() const override;
    operator bool() const override;
    operator std::string() const override;

    BinTreePtr hd() const override;
    BinTreePtr tl() const override;
    BinTreePtr clone() const override;
    bool equals(const BinTreePtr& other) const override;
    std::ostream& pp(std::ostream& os) const override;

};

}

#endif
