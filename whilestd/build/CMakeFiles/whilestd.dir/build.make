# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.22

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build

# Include any dependencies generated for this target.
include CMakeFiles/whilestd.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/whilestd.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/whilestd.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/whilestd.dir/flags.make

CMakeFiles/whilestd.dir/src/main.cpp.o: CMakeFiles/whilestd.dir/flags.make
CMakeFiles/whilestd.dir/src/main.cpp.o: ../src/main.cpp
CMakeFiles/whilestd.dir/src/main.cpp.o: CMakeFiles/whilestd.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/whilestd.dir/src/main.cpp.o"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/whilestd.dir/src/main.cpp.o -MF CMakeFiles/whilestd.dir/src/main.cpp.o.d -o CMakeFiles/whilestd.dir/src/main.cpp.o -c /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/src/main.cpp

CMakeFiles/whilestd.dir/src/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/whilestd.dir/src/main.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/src/main.cpp > CMakeFiles/whilestd.dir/src/main.cpp.i

CMakeFiles/whilestd.dir/src/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/whilestd.dir/src/main.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/src/main.cpp -o CMakeFiles/whilestd.dir/src/main.cpp.s

# Object files for target whilestd
whilestd_OBJECTS = \
"CMakeFiles/whilestd.dir/src/main.cpp.o"

# External object files for target whilestd
whilestd_EXTERNAL_OBJECTS =

whilestd: CMakeFiles/whilestd.dir/src/main.cpp.o
whilestd: CMakeFiles/whilestd.dir/build.make
whilestd: libLeaf.a
whilestd: libNode.a
whilestd: libParsing.a
whilestd: libLeaf.a
whilestd: libNode.a
whilestd: CMakeFiles/whilestd.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable whilestd"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/whilestd.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/whilestd.dir/build: whilestd
.PHONY : CMakeFiles/whilestd.dir/build

CMakeFiles/whilestd.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/whilestd.dir/cmake_clean.cmake
.PHONY : CMakeFiles/whilestd.dir/clean

CMakeFiles/whilestd.dir/depend:
	cd /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build /mnt/c/Users/yanis/Desktop/TLC/Projet/whilec/whilestd/build/CMakeFiles/whilestd.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/whilestd.dir/depend
