cmake_minimum_required(VERSION 3.5)
project(whilestd)


add_subdirectory(googletest) # add googletest subdirectory

# Add the include directory to the include path
include_directories(
    include
    googletest/include)

# Add the Leaf, Node, and Parsing source files to the project
add_library(Leaf src/Leaf.cpp)
add_library(Node src/Node.cpp)
add_library(Parsing src/Parsing.cpp)

# Add the main executable and link it to the Leaf, Node, and Parsing libraries
add_executable(whilestd src/main.cpp)
target_link_libraries(Leaf Node)
target_link_libraries(Parsing Leaf Node)
target_link_libraries(whilestd Leaf Node Parsing)

add_executable(tests test/tests.cpp) # add this executable
target_link_libraries(tests PRIVATE gtest Leaf Node Parsing) # link google test to this executable
