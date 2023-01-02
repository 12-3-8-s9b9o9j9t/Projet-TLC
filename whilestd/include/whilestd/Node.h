#ifndef WHILESTD_NODE_H
#define WHILESTD_NODE_H

#include "whilestd/BinTree.h"
#include <memory>
#include <string>

namespace whilestd {

class Node : public BinTree {
private:
    const std::unique_ptr<BinTree> left;
    const std::unique_ptr<BinTree> right;

public:
    Node(std::unique_ptr<BinTree> left = nullptr, std::unique_ptr<BinTree> right = nullptr);
    virtual ~Node() = default;

    operator int() const override;
    operator bool() const override;
    operator std::string() const override;

    std::unique_ptr<BinTree> hd() const override;
    std::unique_ptr<BinTree> tl() const override;
    std::unique_ptr<BinTree> clone() const override;
    bool equals(const std::unique_ptr<BinTree>& other) const override;
    std::ostream& pp(std::ostream& os) const override;

private:
    bool isNil() const;

};

}

#endif
