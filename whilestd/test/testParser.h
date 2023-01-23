#ifndef TEST_PARSER_H
#define TEST_PARSER_H

#include <gtest/gtest.h>
#include "whilestd/Parser.h"
#include "whilestd/Node.h"
#include "whilestd/Leaf.h"

namespace whilestd {

TEST(parser, parse_int) {
    BinTreePtr tree = Parser::parse("2");
    BinTreePtr node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>(
            std::make_unique<Node>(),
            std::make_unique<Node>()
        )
    );
    EXPECT_TRUE(*(*tree == *node));
}

TEST(parser, parse_cons1) {
    BinTreePtr tree = Parser::parse("(cons)");
    BinTreePtr node = std::make_unique<Node>();
    EXPECT_TRUE(*(*tree == *node));
}

TEST(parser, parse_cons2) {;
    EXPECT_THROW(Parser::parse("(cons"), std::invalid_argument);
}

TEST(parser, parse_cons3) {
    BinTreePtr tree = Parser::parse("(cons nil nil)");
    BinTreePtr node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_TRUE(*(*tree == *node));
}

TEST(parser, parse_cons4) {
    BinTreePtr tree = Parser::parse("(cons int (cons nil nil))");
    BinTreePtr node = std::make_unique<Node>(
        std::make_unique<Leaf>("int"),
        std::make_unique<Node>(
            std::make_unique<Node>(),
            std::make_unique<Node>()
        ));
    EXPECT_TRUE(*(*tree == *node));
}

TEST(parser, parse_cons5) {
    BinTreePtr tree = Parser::parse("(cons (cons (cons)))");
    BinTreePtr nil = std::make_unique<Node>();
    EXPECT_TRUE(*(*tree == *nil));
}

}

#endif
