#ifndef PARSING_TEST_H
#define PARSING_TEST_H

#include <gtest/gtest.h>
#include "Parsing.h"
#include "Node.h"
#include "Leaf.h"

namespace whilestd {

TEST(parsing, parse_int) {
    auto tree = parse("2");
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>(
            std::make_unique<Node>(),
            std::make_unique<Node>()
        )
    );
    EXPECT_TRUE(tree->equals(std::move(node)));
}

}

#endif
