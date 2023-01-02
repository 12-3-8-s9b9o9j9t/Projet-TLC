
#ifndef WHILESTD_BINTREE_H
#define WHILESTD_BINTREE_H

#include <memory>
#include <string>
#include <iostream>

namespace whilestd {

class BinTree;

using BinTreePtr = std::unique_ptr<BinTree>;

class BinTree {
public:
    virtual ~BinTree() = default;

    virtual operator int() const = 0;
    virtual operator bool() const = 0;
    virtual operator std::string() const = 0;

    virtual BinTreePtr hd() const = 0;
    virtual BinTreePtr tl() const = 0;
    virtual BinTreePtr clone() const = 0;
    virtual bool equals(const BinTreePtr& other) const = 0;
    virtual std::ostream& pp(std::ostream& os) const = 0;

};

inline bool operator ==(const BinTreePtr& lhs, const BinTreePtr& rhs) {
    return lhs->equals(rhs);
}

inline bool operator !=(const BinTreePtr& lhs, const BinTreePtr& rhs) {
    return !(lhs == rhs);
}

inline std::ostream& operator <<(std::ostream& os, const BinTreePtr& tree) {
    return tree->pp(os);
}

}

#endif
