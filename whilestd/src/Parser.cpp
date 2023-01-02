#include "whilestd/Parser.h"
#include "whilestd/Leaf.h"
#include "whilestd/Node.h"
#include <memory>
#include <string>
#include <regex>
#include <deque>
#include <algorithm>

namespace {

std::regex symbol("[a-z](?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?");
std::regex separator("\\s+");
std::regex leftparen("\\(");
std::regex rightparen("\\)");

}

namespace whilestd {

std::unique_ptr<BinTree> Parser::parse(const std::string& input) {
    int i = 0;
    if (sscanf(input.c_str(), "%d", &i) == 1) {
        return std::move(toTree(i));   
    }
    else if(auto tmp = consParse(input)){
        return std::move(tmp);
    }
    throw std::invalid_argument("Invalid input");
}

std::unique_ptr<BinTree> Parser::toTree(int i) {
    std::unique_ptr<BinTree> t = std::make_unique<Node>();
    for (int j = 0; j < i; j++) {
        t = std::make_unique<Node>(std::make_unique<Node>(), std::move(t));
    }
    return std::move(t);
}

std::unique_ptr<BinTree> Parser::consParse(const std::string& input) {
    std::string format = std::regex_replace(input, leftparen, " ( ");
    format = std::regex_replace(format, rightparen, " ) ");
    format.erase(format.begin(), std::find_if(format.begin(), format.end(), [](unsigned char ch) {
        return !std::isspace(ch);
    }));

    std::deque<std::string> tokens(
        std::sregex_token_iterator(format.begin(), format.end(), separator, -1),
        std::sregex_token_iterator());

    if (tokens.size() < 3) { // on a pas le minimum qu'est : '(' 'cons' ')'
        return nullptr;
    }
    return consParseRec(tokens);
}

std::unique_ptr<BinTree> Parser::consParseRec(const std::deque<std::string>& tokens) {
    std::unique_ptr<BinTree> t = nullptr;
    if (tokens.size() == 1) {
        
    }
    else if ((tokens.size() >= 3) && (tokens.front() == "(" && tokens[1] == "cons" && tokens.back() == ")")) {
        std::deque<std::unique_ptr<BinTree>> list;

        auto it = tokens.begin() + 2;

        while (it != tokens.end() - 1) {
            if (*it == "(") {
                auto it2 = std::find(it, tokens.end() -1 , ")");
                if (it2 == tokens.end() - 1) {
                    list.push_front(nullptr);
                    break;
                }
                list.push_front(std::move(consParseRec(std::deque<std::string>(it, it2+1))));
                it = it2 + 1;
            }
            else {
                list.push_front(std::move(consParseEnd(*it)));
                it++;
            }
        }
        if (list.empty() || std::find(list.begin(), list.end(), nullptr) == list.end()) {
            switch (list.size()) {
                case 0:
                    t = std::make_unique<Node>();
                    break;
                case 1:
                    t = std::move(list.front());
                    break;
                case 2:
                    t = std::make_unique<Node>(std::move(list.back()), std::move(list.front()));
                    break;
                default:
                    t = std::move(list.front());
                    list.pop_front();
                    while (!list.empty()) {
                        t = std::make_unique<Node>(std::move(list.front()), std::move(t));
                        list.pop_front();
                    }
                    break;
            }
        }
    }
    return std::move(t);
}

std::unique_ptr<BinTree> Parser::consParseEnd(const std::string& token) {
    std::unique_ptr<BinTree> t = nullptr;
    if (token == "nil") {
        t = std::make_unique<Node>();
    }
    else if (std::regex_match(token, symbol)) {
        t = std::make_unique<Leaf>(token);
    }
    return std::move(t);
}

}
