#ifndef CHILD_ANIMAL_H
#define CHILD_ANIMAL_H
#include "Animal.h"

class Dog: public Mammal{
    public:
        Dog(std::string n, COLOR c, std::string owner);
        ~Dog();
        void speak() const;
        void move();
    private:
        std::string owner;
};
class Cat: public Mammal{
    public:
    public:
        Cat(std::string n, COLOR c, std::string owner);
        ~Cat();
        void speak() const;
        void move();
    private:
        std::string owner;
};
class Lion: public Mammal{
    public:
        Lion(std::string n, COLOR c);
        ~Lion();
        void speak() const;
        void move();
};
#endif
