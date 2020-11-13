#include <iostream>
#include <string>
#include "Animal.h"
#include "childAnimal.h"

using namespace std;

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
