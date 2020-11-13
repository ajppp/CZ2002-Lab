#include <iostream>
#include <string>
using namespace std;
enum COLOR { Green, Blue, White, Black, Brown };

class Dog :public Mammal {
    public:
        Dog(){
        }
        Dog(string name, COLOR color, string owner) :Mammal(name, color){
            _owner = owner;
            cout << "constructing Dog object " << Animal::getName() << endl;
            cout << "Color of Dog: " << Animal::getColor() << endl;
            cout << "Owner of Dog: " << _owner << endl;
        }
        ~Dog(){
            cout << "destructing Dog object " << Animal::getName() << endl;
        }
        void eat() const{
            cout << "Dog eat" << endl;
        }
        void speak() const{
            cout << "Dog woof" << endl;
        }
        void move() const{
            cout << "Dog move" << endl;
        }

    private:
        string _owner;
};

class Cat :public Mammal {
    public:
        Cat(){
        }
        Cat(string name, COLOR color, string owner) :Mammal(name, color){
            _owner = owner;
            cout << "constructing Cat object " << Animal::getName() << endl;
            cout << "Color of Cat: " << Animal::getColor() << endl;
            cout << "Owner of Cat: " << _owner << endl;
        }
        ~Cat(){
            cout << "destructing Cat object " << Animal::getName() << endl;
        }
        void eat() const{
            cout << "Cat eat" << endl;
        }
        void speak() const{
            cout << "Cat meow" << endl;
        }
        void move() const {
            cout << "Cat move" << endl;
        }

    private:
        string _owner;
};

class Lion :public Mammal {
    public:
        Lion(){}
        Lion(string name, COLOR color, string owner) :Mammal(name, color){
            _owner = owner;
            cout << "constructing Lion object " << Animal::getName() << endl;
            cout << "Color of Lion: " << Animal::getColor() << endl;
            cout << "Owner of Lion: " << _owner << endl;
        }
        ~Lion(){
            cout << "destructing Lion object " << Animal::getName() << endl;
        }
        void eat() const {
            cout << "Lion eat" << endl;
        }
        void speak() const  {
            cout << "Lion roar" << endl;
        }
        void move() const {
            cout << "Lion move" << endl;
        }

    private:
        string _owner;
};

