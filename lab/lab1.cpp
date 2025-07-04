#include <iostream>
#include <string>

int main() {
    std::string Name;
    int Age = 0;

    std::cout << "Enter your name: ";
    std::cin >> Name;

    std::cout << "Enter your age: ";
    std::cin >> Age;

    std::cout << "- - - - - -" << std::endl;
    std::cout << "Hello " << Name << std::endl;
    std::cout << "Age = " << Age << std::endl;

    return 0;
}
