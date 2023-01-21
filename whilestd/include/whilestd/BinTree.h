#ifndef WHILESTD_BINTREE_H
#define WHILESTD_BINTREE_H

#include <memory>
#include <string>
#include <iostream>

namespace whilestd {

class BinTree;

using BinTreePtr = std::unique_ptr<const BinTree>;

class BinTree {
public:
    virtual ~BinTree() = default;

    virtual operator int() const = 0;
    virtual operator bool() const = 0;
    virtual operator std::string() const = 0;
    virtual BinTreePtr operator ==(const BinTree& other) const = 0;

    virtual BinTreePtr hd() const = 0;
    virtual BinTreePtr tl() const = 0;
    virtual BinTreePtr clone() const = 0;
    virtual std::ostream& pp(std::ostream& os) const = 0;

};

inline std::ostream& operator <<(std::ostream& os, const BinTree& tree) {
    return tree.pp(os);
}

}

#endif
