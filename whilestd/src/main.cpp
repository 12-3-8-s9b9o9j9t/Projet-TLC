#include <iostream>
#include <memory>
#include <string>
#include "whilestd/BinTree.h"
#include "whilestd/Parser.h"

using namespace whilestd;

int main(int argc, char const *argv[]) {
    /* code */

    try {
        auto tree = Parser::parse("(cons a b c d (cons)(cons nil nil nil) )");
        tree->pp(std::cout);
    }
    catch (const std::invalid_argument& e) {
        std::cerr << e.what() << std::endl;
    }

    return 0;
}

