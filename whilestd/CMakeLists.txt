cmake_minimum_required(VERSION 3.5)
project(whilestd)


add_subdirectory(googletest) # add googletest subdirectory

# Add the include directory to the include path
include_directories(
    include
    googletest/include)

# Add the Leaf, Node, and Parser source files to the project
add_library(whilestd STATIC src/Leaf.cpp src/Node.cpp src/Parser.cpp)

add_executable(tests test/tests.cpp) # add this executable
target_link_libraries(tests PRIVATE gtest whilestd) # link google test to this executable
