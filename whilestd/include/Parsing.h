#ifndef WHILESTD_PARSING_H
#define WHILESTD_PARSING_H

#include "BinTree.h"
#include "Node.h"
#include "Leaf.h"
#include <memory>
#include <string>

namespace whilestd {

std::unique_ptr<BinTree> parse(const std::string& input);

}

#endif
