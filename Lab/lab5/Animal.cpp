#include <iostream>
#include <string>

using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown } ;

// Animal Class
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

int main() {
    // 3.1.1 (uncomment the 2 lines below)
    //Animal a;
    //a.speak();

    // 3.1.2 (uncomment the 1 line below)
    //Animal b("Shark", Blue);

    // 3.2.1
    Mammal c("Bear", Brown);
    c.speak();
    c.move(); // 3.2.4

    // 3.2.2
    Dog d("Brian", White, "Peter");
    d.speak(); // 3.2.3
    d.move(); // 3.2.4
    
    // 3.3.1
    // Abstract class cannot be called but can be used as a reference type
    // Using Animal pointer to create a Dog object
    Animal *animalPtr = new Dog("Lassie", White, "Andy");
    // reference calling
    animalPtr->speak();
    animalPtr->move();
    // delete dynamically allocated memory
    delete animalPtr; // destruct

    // 3.3.2
    //Without virtual: The method call is resolved based on the pointer type (Animal*),
    //so Animal::speak() is called.
    //With virtual: The method call is resolved based on the actual object type (Dog),
    //so Dog::speak() is called.

    // 3.3.3
    Dog dogi("Lassie", White, "Andy");
    Mammal *aniPtr = &dogi; // pointer call of type Mammal to Dog Object
    Mammal &aniRef = dogi; // reference call of type Mammal to Dog Object
    Mammal aniVal = dogi; // Mammal type Variable to Dog Object (Object Slicing)
    aniPtr->speak(); // Lassie Woof - pointers can access derived class virtual methods due to dynamic polymorphism
    aniRef.speak(); // Lassie Woof - reference maintain dynamic binding with virtual methods due to dynamic polymorphism
    aniVal.speak(); // Animal speaks - Mammal overrides since it is a variable so it calls the animal speak
    // Conclusion: Pointer and Reference correctly use dynamic binding so use derived or dog speak method
    // Value assignment cause object slicing using Mammal or Animal version

    
    cout << "Program exiting …. "<< endl ;

    return 0;
}