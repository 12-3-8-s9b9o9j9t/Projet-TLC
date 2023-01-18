#ifndef TEST_LEAF_H
#define TEST_LEAF_H

#include <gtest/gtest.h>
#include "whilestd/Leaf.h"
#include "whilestd/Node.h"

using namespace whilestd;

TEST(leaf, operator_int) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_EQ(0, static_cast<int>(*leaf));
}

TEST(leaf, operator_bool) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_FALSE(static_cast<bool>(*leaf));
}

TEST(leaf, operator_string) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_EQ("a", static_cast<std::string>(*leaf));
}

TEST(leaf, equals1) {
    auto leaf1 = std::make_unique<Leaf>("a");
    auto leaf2 = std::make_unique<Leaf>("a");
    EXPECT_TRUE(leaf1->equals(std::move(leaf2->clone())));
    EXPECT_FALSE(leaf2 == nullptr);
}

TEST(leaf, equals2) {
    auto leaf1 = std::make_unique<Leaf>("a");
    auto leaf2 = std::make_unique<Leaf>("b");
    EXPECT_FALSE(leaf1->equals(std::move(leaf2->clone())));
    EXPECT_FALSE(leaf2 == nullptr);
}

TEST(leaf, equals3) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_FALSE(leaf->equals(std::make_unique<Node>()));
}

TEST(leaf, hd) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_TRUE(leaf->hd()->equals(std::make_unique<Node>()));
}

TEST(leaf, tl) {
    auto leaf = std::make_unique<Leaf>("a");
    EXPECT_TRUE(leaf->tl()->equals(std::make_unique<Node>()));
}

TEST(leaf, clone) {
    auto leaf = std::make_unique<Leaf>("a");
    auto clone = leaf->clone();
    EXPECT_TRUE(leaf->equals(clone));
}

TEST(leaf, pp) {
    auto leaf = std::make_unique<Leaf>("a");
    std::stringstream ss;
    leaf->pp(ss);
    EXPECT_EQ("a", ss.str());
}

#endif
