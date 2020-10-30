#include <iostream>
#include <string>

enum COLOR { Green, Blue, White, Black, Brown };

class Animal{
    public:
        Animal() :_name("unknown") {
            std::cout << "constructing Animal object "<< _name << std::endl;
        }
        ~Animal(){
            std::cout << "destructing Animal object "<< _name << std::endl;
        }
        void speak() const {
            std::cout << "Animal speaks "<< std::endl;
        }
        void move() const {

        }

    private:
        std::string _name;
        COLOR _color;
};

int main(){
    Animal a;
    a.speak();
    std::cout << "Program exiting ..." << std::endl;
    return 0;
}
