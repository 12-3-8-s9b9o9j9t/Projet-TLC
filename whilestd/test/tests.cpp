#include "testLeaf.h"
#include "testNode.h"
#include "testParser.h"
#include "testBoolean.h"

int main(int argc, char **argv) {
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}
