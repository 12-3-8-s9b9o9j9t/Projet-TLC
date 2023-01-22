#ifndef WHILESTD_BOOLEAN_H
#define WHILESTD_BOOLEAN_H

#include "whilestd/BinTree.h"
#include "whilestd/Node.h"

namespace whilestd {

inline BinTreePtr boolean(bool b) {
    return b
        ? std::make_unique<Node>(
            std::make_unique<Node>(),
            std::make_unique<Node>())
        : std::make_unique<Node>();
}

}

#endif
