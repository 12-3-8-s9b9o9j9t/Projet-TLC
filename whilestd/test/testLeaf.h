#ifndef TEST_LEAF_H
#define TEST_LEAF_H

#include <gtest/gtest.h>
#include "whilestd/Leaf.h"
#include "whilestd/Node.h"

namespace whilestd {

TEST(leaf, operator_int) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_EQ(0, static_cast<int>(*leaf));
}

TEST(leaf, operator_bool) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_FALSE(*leaf);
}

TEST(leaf, operator_string) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_EQ("a", static_cast<std::string>(*leaf));
}

TEST(leaf, operator_comp1) {
    auto leaf1 = std::make_unique<Leaf>("a");
    auto leaf2 = std::make_unique<Leaf>("a");
    EXPECT_TRUE(*(*leaf1 == *leaf2));
}

TEST(leaf, operator_comp2) {
    auto leaf1 = std::make_unique<Leaf>("a");
    auto leaf2 = std::make_unique<Leaf>("b");
    EXPECT_FALSE(*(*leaf1 == *leaf2));
}

TEST(leaf, operator_comp3) {
    auto leaf = std::make_unique<Leaf>("a");
    auto nil = std::make_unique<Node>();
    EXPECT_FALSE(*(*leaf == *nil));
}

TEST(leaf, hd) {
    auto leaf = std::make_unique<Leaf>("a");
    auto nil = std::make_unique<Node>();
    EXPECT_TRUE(*(*leaf->hd() == *nil));
}

TEST(leaf, tl) {
    auto leaf = std::make_unique<Leaf>("a");
    auto nil = std::make_unique<Node>();
    EXPECT_TRUE(*(*leaf->tl() == *nil));
}

TEST(leaf, clone1) {
    auto leaf = std::make_unique<Leaf>("a");
    auto clone = leaf->clone();
    EXPECT_TRUE(*(*leaf == *clone));
}

TEST(leaf, pp) {
    auto leaf = std::make_unique<Leaf>("a");
    std::stringstream ss;
    leaf->pp(ss);
    EXPECT_EQ("a", ss.str());
}
}

#endif
