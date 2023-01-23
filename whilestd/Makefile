CXXFLAGS := -Iinclude -Wall -Werror -O3 -std=c++20
SRC := $(wildcard src/*.cpp)
OBJ := $(SRC:src/%.cpp=build/%.o)
LIB := build/libwhilestd.a

all: dir $(LIB)

dir:
	mkdir -p build

build/%.o: src/%.cpp
	$(CXX) -c $(CPPFLAGS) $(CXXFLAGS) $^ -o $@

$(LIB): $(OBJ)
	ar rcs $@ $^

clean:
	rm -r build
