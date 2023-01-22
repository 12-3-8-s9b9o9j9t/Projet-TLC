#ifndef TEST_BOOLEAN_H
#define TEST_BOOLEAN_H

#include <gtest/gtest.h>
#include "whilestd/BinTree.h"
#include "whilestd/boolean.h"

using namespace whilestd;

TEST(Bool, True) {
    EXPECT_TRUE(*boolean(true));
}

TEST(Bool, False) {
    EXPECT_FALSE(*boolean(false));
}

#endif
