
#ifndef WHILESTD_BINTREE_H
#define WHILESTD_BINTREE_H

#include <memory>
#include <string>
#include <iostream>

namespace whilestd {

class BinTree {
public:
    virtual ~BinTree() = default;

    virtual operator int() const = 0;
    virtual operator bool() const = 0;
    virtual operator std::string() const = 0;

    virtual std::unique_ptr<BinTree> hd() const = 0;
    virtual std::unique_ptr<BinTree> tl() const = 0;
    virtual std::unique_ptr<BinTree> clone() const = 0;
    virtual bool equals(const std::unique_ptr<BinTree>& other) const = 0;
    virtual std::ostream& pp(std::ostream& os) const = 0;

};

inline std::ostream& operator <<(std::ostream& os, const std::unique_ptr<BinTree>& tree) {
    return tree.get()->pp(os);
}

}

#endif
