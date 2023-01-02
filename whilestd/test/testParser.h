#ifndef PARSer_TEST_H
#define PARSer_TEST_H

#include <gtest/gtest.h>
#include "whilestd/Parser.h"
#include "whilestd/Node.h"
#include "whilestd/Leaf.h"

namespace whilestd {

TEST(parser, parse_int) {
    auto tree = Parser::parse("2");
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>(
            std::make_unique<Node>(),
            std::make_unique<Node>()
        )
    );
    EXPECT_TRUE(tree->equals(std::move(node->clone())));
}

TEST(parser, parse_cons1) {
    auto tree = Parser::parse("(cons)");
    auto node = std::make_unique<Node>();
    EXPECT_TRUE(tree->equals(std::move(node->clone())));
}

TEST(parser, parse_cons2) {
    auto tree = Parser::parse("(cons nil nil)");
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_TRUE(tree->equals(std::move(node->clone())));
}

}

#endif
