#ifndef ANIMAL_H
#define ANIMAL_H

#include <iostream>
#include <string>

using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown } ;

// Animal Class (Abstract)
class Animal {
    public :
    // Constructor
    Animal() : _name("unknown") {
        cout << "constructing Animal object "<< _name << endl ;
    }

    // Overloaded Constructor
    Animal(string name, COLOR color) : _name(name), _color(color) {
        cout << "constructing Animal object " << _name << " with color " << getColorName(color) << endl;
    }
    // Destructor
    ~Animal() {
        cout << "destructing Animal object "<< _name << endl ;
    }

    // Methods
    // Add virtual to allow method overriding in class inheritance
    virtual void speak() const {
        cout << "Animal speaks "<< endl ;
    }

    // Pure Method as an Abstract Method; virtual + const = 0;
    // this makes the animal class as abstract class
    virtual void move() const = 0;

    // change from private to protected so inheriting classes can use
    protected :
    string _name;
    COLOR _color;

    string getColorName(COLOR color) const {
        switch(color) {
            case Green: return "Green";
            case Blue: return "Blue";
            case White: return "White";
            case Black: return "Black";
            case Brown: return "Brown";
            default: return "Unknown Color";
        }
    }
};

// Mammal Class
class Mammal : public Animal {
    public:
    // Mammal Constructor with Animal Constructor
    Mammal(string n, COLOR c) : Animal(n, c) {
        cout << "Constructing Mammal object with name: " << _name << " and color: " << getColorName(_color) << endl;
    }

    // Destructor
    ~Mammal() {
        cout << "Destructing Mammal object " << _name << endl;
    }

    // Methods
    void eat() const {
        cout << "Mammal eat " << endl;
    }

    void move() const {
        cout << "Mammal moves " << endl;
    }
};

#endif