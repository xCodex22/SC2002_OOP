#include <iostream>
#include <vector>
#include "Animal.h"
#include "childAnimal.h"

// Function to return color from ENUM options
COLOR selectColor() {
    int colorChoice;
    cout << "Select color: (1) Green (2) Blue (3) White (4) Black (5) Brown" << endl;
    cout << "Enter your choice: ";
    cin >> colorChoice;

    switch (colorChoice) {
        case 1: return Green;
        case 2: return Blue;
        case 3: return White;
        case 4: return Black;
        case 5: return Brown;
        default:
            cout << "Invalid choice. Defaulting to White." << endl;
            return White;
    }
}

int main() {
    // 1. vector (dynamic "array")
    //vector<Mammal*> zoo;

    // 2. pointer array
    const int MAX_ANIMALS = 100;
    Mammal* zoo[MAX_ANIMALS];
    int animalCount = 0;

    int choice;
//--------------------------------------------------------------------------------------------------------//
    // 1. Vector (Dynamic "Array") Method
    //while (true) {
    //    cout << "Select the animal to send to Zoo:" << endl;
    //    cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
    //    cout << "Enter your choice: ";
    //    cin >> choice;
//
    //    if (choice == 1) {
    //        zoo.push_back(new Dog("Brian", White, "Peter"));
    //    } else if (choice == 2) {
    //        zoo.push_back(new Cat("Elsa", Black, "Elvina"));
    //    } else if (choice == 3) {
    //        zoo.push_back(new Lion("Simba", Brown, "Mufasa"));
    //    } else if (choice == 4) {
    //        for (auto animal : zoo) {
    //            animal->move();
    //            animal->speak();
    //            animal->eat();
    //        }
    //    } else if (choice == 5) {
    //        break;
    //    } else {
    //        cout << "Invalid choice. Try again." << endl;
    //    }
    //}
//
    //for (auto animal : zoo) {
    //    delete animal;
    //}
//--------------------------------------------------------------------------------------------------------//
    // 2. Pointer Array Method
    while (true) {
        cout << "Select the animal to send to Zoo:" << endl;
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        if (choice == 5) break;

        if (choice == 4) {
            for (int i = 0; i < animalCount; ++i) {
                zoo[i]->move();
                zoo[i]->speak();
                zoo[i]->eat();
            }
            continue;
        }

        if (animalCount >= MAX_ANIMALS) {
            cout << "Zoo is full! Cannot add more animals." << endl;
            continue;
        }

        string name;
        COLOR color;
        string owner;

        cout << "Enter animal name: ";
        cin >> name;
        color = selectColor();
        cout << "Enter owner's name: ";
        cin >> owner;

        switch (choice) {
            case 1: // Dog
                zoo[animalCount++] = new Dog(name, color, owner);
                break;
            case 2: // Cat
                zoo[animalCount++] = new Cat(name, color, owner);
                break;
            case 3: // Lion
                zoo[animalCount++] = new Lion(name, color, owner);
                break;
            default:
                cout << "Invalid choice. Try again." << endl;
        }
    }

    for (int i = 0; i < animalCount; ++i) {
        delete zoo[i];
    }

//--------------------------------------------------------------------------------------------------------//
    
    cout << "Program exiting …" << endl;
    return 0;
}

// If it were an array of Animal objects (rather than pointers or references),
// object slicing would occur, and the program would lose polymorphic behavior,
// preventing derived classes’ speak and move methods from being called. 
//Therefore, an array of Animal* pointers (as shown) ensures polymorphic behavior.