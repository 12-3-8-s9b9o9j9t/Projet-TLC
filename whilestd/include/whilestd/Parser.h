#ifndef WHILESTD_PARSER_H
#define WHILESTD_PARSER_H

#include "whilestd/BinTree.h"
#include <memory>
#include <string>
#include <deque>

namespace whilestd {

class Parser {
public:
    
    static std::unique_ptr<BinTree> parse(const std::string& input);

private:
    static std::unique_ptr<BinTree> toTree(int i);
    static std::unique_ptr<BinTree> consParse(const std::string& input);
    static std::unique_ptr<BinTree> consParseRec(const std::deque<std::string>& tokens);
    static std::unique_ptr<BinTree> consParseEnd(const std::string& token);

};

}

#endif
