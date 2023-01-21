#ifndef TEST_BOOL_H
#define TEST_BOOL_H

#include <gtest/gtest.h>
#include "whilestd/BinTree.h"
#include "whilestd/Bool.h"

using namespace whilestd;

TEST(Bool, True) {
    EXPECT_TRUE(*Bool(true));
}

TEST(Bool, False) {
    EXPECT_FALSE(*Bool(false));
}

#endif
