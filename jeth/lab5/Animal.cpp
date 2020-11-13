#include "Animal.h"

Animal::Animal() :_name("unknown") {
    std::cout << "constructing Animal object "<< _name << std::endl;
}
Animal::Animal(std::string n, COLOR c) :_name(n), _color(c) {
    std::cout << "constructing Animal object " << _name << " its color is " << COLOR(_color) << std::endl;
}
Animal::~Animal(){
    std::cout << "destructing Animal object "<< _name << std::endl;
}
void Animal::speak() const {
    std::cout << "Animal speaks "<< std::endl;
}
void Animal::move(){}; 

void Mammal::eat() const {
    std::cout << "Mammal eat " << std::endl;
}
 void Mammal::move() {
    std::cout << "Mammal is moving" << std::endl;
}

Mammal::Mammal(std::string n, COLOR c) : Animal(n, c) {
    std::cout << "Constructing Mammal object " << n << std::endl;
}
Mammal::~Mammal() = default;
