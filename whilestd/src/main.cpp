#include <iostream>
#include <memory>
#include <string>
#include "BinTree.h"
#include "Node.h"

using namespace whilestd;

int main(int argc, char const *argv[]) {
    /* code */
    auto tree = std::make_unique<Node>();

    std::cout<<tree.get();
    
    return 0;
}

