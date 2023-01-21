#ifndef TEST_NODE_H
#define TEST_NODE_H

#include <gtest/gtest.h>
#include "whilestd/Node.h"
#include "whilestd/Leaf.h"

using namespace whilestd;

TEST(node, operator_int_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_EQ(0, static_cast<int>(*nil));
}

TEST(node, operator_int) {
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_EQ(1, static_cast<int>(*node));
}

TEST(node, operator_bool_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_FALSE(*nil);
}

TEST(node, operator_bool) {
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_TRUE(*node);
}

TEST(node, operator_string_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_EQ("", static_cast<std::string>(*nil));
}

TEST(node, operator_string1) {
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_EQ("", static_cast<std::string>(*node));
}

TEST(node, operator_string2) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_EQ("ab", static_cast<std::string>(*node));
}

TEST(node, operator_comp_nil1) {
    auto nil1 = std::make_unique<Node>();
    auto nil2 = std::make_unique<Node>();
    EXPECT_TRUE(*(*nil1 == *nil2));
}

TEST(node, operator_comp_nil2) {
    auto nil = std::make_unique<Node>();
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_FALSE(*(*nil == *node));
}

TEST(node, operator_comp_nil3) {
    auto nil = std::make_unique<Node>();
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_FALSE(*(*nil == *leaf));
}

TEST(node, operator_comp1) {
    auto node1 = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    auto node2 = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_TRUE(*(*node1 == *node2));
}

TEST(node, operator_comp2) {
    auto node1 = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Leaf>("b"));
    auto node2 = std::make_unique<Node>(
        std::make_unique<Leaf>("b"),
        std::make_unique<Node>());
    EXPECT_FALSE(*(*node1 == *node2));
}

TEST(node, hd_nil) {
    auto nil = std::make_unique<Node>();
    auto nil2 = std::make_unique<Node>();
    EXPECT_TRUE(*(*nil->hd() == *nil2));
}

TEST(node, hd) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_TRUE(*(*node->hd() == *leaf));
}

TEST(node, tl_nil) {
    auto nil = std::make_unique<Node>();
    auto nil2 = std::make_unique<Node>();
    EXPECT_TRUE(*(*nil->tl() == *nil2));
}

TEST(node, tl) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    auto leaf = std::make_unique<Leaf>("b");
    EXPECT_TRUE(*(*node->tl() == *leaf));
}

TEST(node, clone_nil) {
    auto nil = std::make_unique<Node>();
    auto nil2 = std::make_unique<Node>();
    EXPECT_TRUE(*(*nil->clone() == *nil2));
}

TEST(node, clone1) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    auto node2 = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_TRUE(*(*node->clone() == *node2));
}

TEST(node, pp_nil) {
    auto nil = std::make_unique<Node>();
    std::stringstream ss;
    nil->pp(ss);
    EXPECT_EQ("nil", ss.str());
}

TEST(node, pp_int) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("int"),
        std::make_unique<Node>());
    std::stringstream ss;
    node->pp(ss);
    EXPECT_EQ("0", ss.str());
}

TEST(node, pp_bool) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("bool"),
        std::make_unique<Node>());
    std::stringstream ss;
    node->pp(ss);
    EXPECT_EQ("false", ss.str());
}

TEST(node, pp_string) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("string"),
        std::make_unique<Leaf>("abc"));
    std::stringstream ss;
    node->pp(ss);
    EXPECT_EQ("abc", ss.str());
}

TEST(node, pp_default) {
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    std::stringstream ss;
    node->pp(ss);
    EXPECT_EQ("(cons nil nil)", ss.str());
}

TEST(node, isnil_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_TRUE(nil->isNil());
}

TEST(node, isnil) {
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_FALSE(node->isNil());
}

#endif
