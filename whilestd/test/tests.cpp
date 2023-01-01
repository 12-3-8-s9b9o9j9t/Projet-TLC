#include "testLeaf.h"
#include "testNode.h"
#include "testParsing.h"

int main(int argc, char **argv) {
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}
