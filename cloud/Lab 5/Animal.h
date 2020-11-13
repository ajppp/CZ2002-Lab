#include <iostream>
#include <string>
using namespace std;
enum COLOR { Green, Blue, White, Black, Brown };

class Animal {

    public:
        Animal() : _name("unknown") {
            cout << "constructing Animal object " << _name << endl;
        }

        Animal(string name, COLOR color) {
            _name = name; _color = color;
            cout << "constructing Animal object " << _name << endl;
            cout << "Color of Animal: " << _color << endl;
        }

        ~Animal() {
            cout << "destructing Animal object " << _name << endl;
        }

        string getName() {
            return _name;
        }

        COLOR getColor() {
            return _color;
        }

        virtual void speak() const {
            cout << "Animal speaks " << endl;
        }
        virtual void move() const = 0;

    private:
        string _name;
        COLOR _color;
};

class Mammal : public Animal {
    public:
        Mammal() {
        }

        Mammal(string name, COLOR color) :Animal(name, color) {
            cout << "constructing Mammal object " << Animal::getName() << endl;
            cout << "Color of Mammal: " << Animal::getColor() << endl;
        }

        ~Mammal(){
            cout << "destructing Mammal object " << Animal::getName() << endl;
        }

        virtual void eat() const {
            cout << "Mammal eat " << endl;
        }

        void speak() const {
            cout << "Mammal speak " << endl;
        }

        void move() const {
            cout << "Mammal move " << endl;
        }
};
