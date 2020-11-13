#include "childAnimal.h"

Dog::Dog(std::string n, COLOR c, std::string owner):Mammal(n, c){
    owner = owner;
}

Dog::~Dog() = default;

void Dog::speak() const {
    std::cout << "Woof" << std::endl;
}

void Dog::move() {
    std::cout << "Dog moves" << std::endl;
}

Cat::Cat(std::string n, COLOR c, std::string owner) : Mammal(n, c){
    owner = owner;
}

Cat::~Cat() = default;

void Cat::speak() const {
    std::cout << "Meow" << std::endl;
}

void Cat::move() {
    std::cout << "Cat moves" << std::endl;
}

Lion::Lion(std::string n, COLOR c):Mammal(n, c){}

Lion::~Lion() = default;

void Lion::speak() const {
    std::cout << "Roar" << std::endl;
}

void Lion::move() {
    std::cout << "Lion moves" << std::endl;
}
