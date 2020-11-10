#include "Animal.h"
#include "childAnimal.h"

int main(){
    std::cout << "Enter number of animals you want:\n";
    int numOfAnimals;
    std::cin >> numOfAnimals;
    Mammal* mammals[numOfAnimals]; 
    int choice = 0, i = 0;
    do{
        std::cout << "Select the animal to send to Zoo :\n"
            "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit\n" << std::endl;
        std::cin >> choice;
        switch (choice) {
            case 1:
                mammals[i] = new Dog("Dog", Green, "Cloud");
                break;
            case 2:
                mammals[i] = new Cat("Cat", Black, "Cloud");
                break;
            case 3:
                mammals[i] = new Lion("Lion", White);
                break;
            case 4:
                for (auto & mammal:mammals){
                    mammal->move();
                    mammal->speak();
                    mammal->eat();
                }
                break;
        }
        i++;
    } while (choice < 5);
    return 0;
}
