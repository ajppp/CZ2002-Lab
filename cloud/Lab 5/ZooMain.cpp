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



int main() {

	int choice = 0;
	int index = 0;

	Mammal* zoo[8];
	while (choice < 5) {
        cout << "Select the animal to send to Zoo: " << endl;
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
        cin >> choice;
        switch(choice){
        case 1:
            zoo[index] = new Dog("Inu", Blue, "Dog Owner");
            index++;
            break;
        case 2:
            zoo[index] = new Cat("Neko", White, "Cat Owner");
            index++;
            break;
        case 3:
            zoo[index] = new Lion("Lion", Brown, "Lion Owner");
            index++;
            break;
        case 4:
            for (int i=0; i < index; i++){
                zoo[i]->move();
                zoo[i]->speak();
                zoo[i]->eat();
                cout << "\n" << endl;
            }
            break;
        case 5:
            for (int i=0; i < index; i++){
                delete zoo[i];
            }
            delete[] zoo;
            cout << "Exiting program..." << endl;
            return 0;
        }
    }
}
