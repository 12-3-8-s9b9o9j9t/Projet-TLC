#include <whilestd/BinTree.h>
#include <whilestd/Node.h>
#include <whilestd/Leaf.h>
#include <whilestd/Parser.h>
#include <stack>


using namespace whilestd;

namespace {

std::stack<BinTreePtr> _stack;

BinTreePtr add_() {
    // récupère les inputs
    BinTreePtr Op2_ = std::move(_stack.top());
    _stack.pop();
    BinTreePtr Op1_ = std::move(_stack.top());
    _stack.pop();

    // initialise les variables locales
    BinTreePtr Result_ = std::make_unique<Node>();

    auto _R0 = std::move(Op1_->clone());
    Result_ = std::move(_R0);
    auto _R1 = std::move(Op2_->clone());
    auto _i0 = std::move(_R1);

    while (static_cast<bool>(*_i0)) {
        auto _R2 = std::move(_i0->tl());
        _i0 = std::move(_R2);
        BinTreePtr _R3 = std::make_unique<Node>();
        auto _R4 = std::move(Result_->clone());
        auto _R5 = std::make_unique<Node>(std::move(_R3), std::move(_R4));
        Result_ = std::move(_R5);
    }


    // retourne les résultats
    return std::move(Result_->clone());
}


} // namespace

int main(int argc, char** argv) {
    // récupère les inputs
    if (argc < 3) {
        std::cerr << "Not enough arguments: " << (argc - 1) << "given, 2 needed" << std::endl;
        return 1;
    } else if (argc > 3) {
        std::cerr << "Too many arguments: " << (argc - 1) << "given, 2 needed" << std::endl;
        return 1;
    }
	
	BinTreePtr Op2_;
    try {
        Op2_ = std::move(Parser::parse(argv[1]));
    } catch (std::invalid_argument& e) {
        std::cerr << "Invalid argument " << argv[1] << std::endl;
        return 1;
    }
	BinTreePtr Op1_;
    try {
        Op1_ = std::move(Parser::parse(argv[2]));
    } catch (std::invalid_argument& e) {
        std::cerr << "Invalid argument " << argv[2] << std::endl;
        return 1;
    }

    // initialise les variables locales
    BinTreePtr Res_ = std::make_unique<Node>();

    BinTreePtr _R6 = std::make_unique<Leaf>("int");
    auto _R7 = std::move(Op1_->clone());
    _stack.push(std::move(_R7));
    auto _R8 = std::move(Op2_->clone());
    _stack.push(std::move(_R8));
    auto _R9 = std::move(add_());
    auto _R10 = std::make_unique<Node>(std::move(_R8), std::move(_R9));
    Res_ = std::move(_R10);

    // affiche les résultats
    std::cout << Res_ << std::endl;

    return 0;
}

