#ifndef WHILESTD_BOOL_H
#define WHILESTD_BOOL_H

#include "whilestd/BinTree.h"
#include "whilestd/Node.h"

namespace whilestd {

inline BinTreePtr Bool(bool b) {
    return b
        ? std::make_unique<Node>(
            std::make_unique<Node>(),
            std::make_unique<Node>())
        : std::make_unique<Node>();
}

}

#endif
