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
    EXPECT_FALSE(static_cast<bool>(*nil));
}

TEST(node, operator_bool) {
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_TRUE(static_cast<bool>(*node));
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

TEST(node, equals_nil1) {
    auto nil1 = std::make_unique<Node>();
    auto nil2 = std::make_unique<Node>();
    EXPECT_TRUE(nil1->equals(std::move(nil2->clone())));
    EXPECT_FALSE(nil2 == nullptr);
}

TEST(node, equals_nil2) {
    auto nil = std::make_unique<Node>();
    auto node = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Node>());
    EXPECT_FALSE(nil->equals(std::move(node->clone())));
    EXPECT_FALSE(node == nullptr);
}

TEST(node, equals_nil3) {
    auto nil = std::make_unique<Node>();
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_FALSE(nil->equals(std::move(leaf->clone())));
    EXPECT_FALSE(leaf == nullptr);
}

TEST(node, equals1) {
    auto node1 = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    auto node2 = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_TRUE(node1->equals(std::move(node2->clone())));
    EXPECT_FALSE(node2 == nullptr);
}

TEST(node, equals2) {
    auto node1 = std::make_unique<Node>(
        std::make_unique<Node>(),
        std::make_unique<Leaf>("b"));
    auto node2 = std::make_unique<Node>(
        std::make_unique<Leaf>("b"),
        std::make_unique<Node>());
    EXPECT_FALSE(node1->equals(std::move(node2->clone())));
    EXPECT_FALSE(node2 == nullptr);
}

TEST(node, hd_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_TRUE(nil->hd()->equals(std::make_unique<Node>()));
}

TEST(node, hd) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_TRUE(node->hd()->equals(std::make_unique<Leaf>("a")));
}

TEST(node, tl_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_TRUE(nil->tl()->equals(std::make_unique<Node>()));
}

TEST(node, tl) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_TRUE(node->tl()->equals(std::make_unique<Leaf>("b")));
}

TEST(node, clone_nil) {
    auto nil = std::make_unique<Node>();
    EXPECT_TRUE(nil->clone()->equals(std::make_unique<Node>()));
}

TEST(node, clone) {
    auto node = std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"));
    EXPECT_TRUE(node->clone()->equals(std::make_unique<Node>(
        std::make_unique<Leaf>("a"),
        std::make_unique<Leaf>("b"))));
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

#endif
