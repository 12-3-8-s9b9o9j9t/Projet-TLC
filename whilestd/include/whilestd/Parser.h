#ifndef WHILESTD_PARSER_H
#define WHILESTD_PARSER_H

#include "whilestd/BinTree.h"
#include <memory>
#include <string>
#include <deque>

namespace whilestd {

class Parser {
public:
    Parser() = delete;
    
    static BinTreePtr parse(const std::string& input);

private:
    static BinTreePtr toTree(int i);
    static BinTreePtr consParse(const std::string& input);
    static BinTreePtr consParseRec(const std::deque<std::string>& tokens);
    static BinTreePtr consParseEnd(const std::string& token);

};

}

#endif
