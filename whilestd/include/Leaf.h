#ifndef WHILESTD_LEAF_H
#define WHILESTD_LEAF_H

#include "BinTree.h"
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

    std::unique_ptr<BinTree> hd() const override;
    std::unique_ptr<BinTree> tl() const override;
    std::unique_ptr<BinTree> clone() const override;
    bool equals(const std::unique_ptr<BinTree>& other) const override;
    std::ostream& pp(std::ostream& os) const override;

};

}

#endif
