#ifndef CHILDANIMAL_H
#define CHILDANIMAL_H

#include "Animal.h"

// Dog Class
class Dog : public Mammal {
    public:
    // Dog Constructor with Mammal Constructor
    Dog(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {
        cout << "Constructing Dog object with name: " << _name << " and color: " << getColorName(_color) <<  " owned by: " << _owner << endl;
    }

    // Destructor
    ~Dog() {
        cout << "Destructing Dog object " << _name << endl;
    }

    void speak() const {
        cout << _name << " Woof" << endl;
    }

    void move() const override {
        cout << _name << " the Dog runs" << endl;
    }
    private :
    string _owner;
};

// Cat Class
class Cat : public Mammal {
    public:
    // Dog Constructor with Mammal Constructor
    Cat(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {
        cout << "Constructing Cat object with name: " << _name << " and color: " << getColorName(_color) <<  " owned by: " << _owner << endl;
    }

    // Destructor
    ~Cat() {
        cout << "Destructing Cat object " << _name << endl;
    }

    void speak() const {
        cout << _name << " Meow" << endl;
    }

    void move() const override {
        cout << _name << " the Cat prowls." << endl;
    }

    private :
    string _owner;
};

// Lion Class
class Lion : public Mammal {
    public:
    // Dog Constructor with Mammal Constructor
    Lion(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {
        cout << "Constructing Lion object with name: " << _name << " and color: " << getColorName(_color) <<  " owned by: " << _owner << endl;
    }

    // Destructor
    ~Lion() {
        cout << "Destructing Lion object " << _name << endl;
    }

    void speak() const {
        cout << _name << " Roar" << endl;
    }

    void move() const override {
        cout << _name << " the Lion stalks." << endl;
    }

    private :
    string _owner;
};

#endif