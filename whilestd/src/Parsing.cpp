#include "Parsing.h"
#include "Leaf.h"
#include "Node.h"
#include <memory>
#include <string>
#include <regex>

namespace {

std::regex symbol("[a-z](?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?");
std::regex separator("\\s+");

}

namespace whilestd {

std::unique_ptr<BinTree> toTree(int i) {
    std::unique_ptr<BinTree> t = std::make_unique<Node>();
    for (int j = 0; j < i; j++) {
        t = std::make_unique<Node>(std::make_unique<Node>(), std::move(t));
    }
    return t;
}

std::unique_ptr<BinTree> consParse(const std::string& input) {
    if (input == "nil") {
        return std::make_unique<Node>();
    }
    else if (regex_match(input, symbol)) {
        return std::make_unique<Leaf>(input);
    }
    /*else if (input[0] == '(' && input[input.size() - 1] == ')') {
        trim(input.substr(1, input.size() - 2));
        if (input.rfind("cons", 0) == 0) {
            auto rec = consParseRec(trim(input.substr(4)));

            std::unique_ptr<BinTree> t = nullptr;
            switch (rec.size()) {
                case 0:
                    return std::make_unique<Node>();
                    break;
                case 1:
                    t = std::move(rec.top());
                    rec.pop();
                    return t;
                    break;
                default:
                    t = std::move(rec.top());
                    rec.pop();
                    while (!rec.empty()) {
                        t = std::make_unique<Node>(std::move(rec.top()), std::move(t));
                        rec.pop();
                    }
                    return t;
                    break;
            }
        }
        else {
            return nullptr;
        }
    }*/
    return nullptr;
}
/*
std::stack<std::unique_ptr<BinTree>> consParseRec(const std::string& input) {
    std::stack<std::unique_ptr<BinTree>> rec;
    std::vector<std::string> tokens;

    std::copy(
        std::sregex_token_iterator(input.begin(), input.end(), regexSep, -1),
        std::sregex_token_iterator(),
        std::back_inserter(tokens));
    
    std::string tmp;
    int depth = 0;

    for (auto s : tokens) {
        tmp += s;
        depth = std::count(tmp.begin(), tmp.end(), '(') - std::count(tmp.begin(), tmp.end(), ')');
        if (depth == 0) {
            rec.push(consParse(tmp));
            tmp = "";
        }
        else {
            tmp += " ";
        }
    }
    return rec;
}*/

std::unique_ptr<BinTree> parse(const std::string& input) {
    int i = 0;
    if (sscanf(input.c_str(), "%d", &i) == 1) {
        return toTree(i);   
    }
    return consParse(input);
}

}
