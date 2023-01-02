#ifndef WHILESTD_NODE_H
#define WHILESTD_NODE_H

#include "whilestd/BinTree.h"
#include <memory>
#include <string>

namespace whilestd {

class Node : public BinTree {
private:
    const BinTreePtr left;
    const BinTreePtr right;

public:
    Node(BinTreePtr left = nullptr, BinTreePtr right = nullptr);
    virtual ~Node() = default;

    operator int() const override;
    operator bool() const override;
    operator std::string() const override;

    BinTreePtr hd() const override;
    BinTreePtr tl() const override;
    BinTreePtr clone() const override;
    bool equals(const BinTreePtr& other) const override;
    std::ostream& pp(std::ostream& os) const override;

private:
    bool isNil() const;

};

}

#endif
