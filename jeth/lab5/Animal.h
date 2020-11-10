#ifndef ANIMAL
#define ANIMAL
#include <iostream>

enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
    public:
        Animal();
        Animal(std::string n, COLOR c);
        ~Animal();
        virtual void speak() const;
        virtual void move() = 0;

    private:
        std::string _name;
        COLOR _color;
};

class Mammal:public Animal {
    public:
        void eat() const;
        void move();
        Mammal(std::string n, COLOR c);
        Mammal();
        ~Mammal();
};
#endif
