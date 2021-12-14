package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
//    INSTANCE VARIABLES
    String name;
    Gender gender;

//    CONSTRUCTORS
    public Animal(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

//    METHODS
    public void move(){
        System.out.println("I moved 0.25 m.");
    }

    abstract void makeSound();

    public void sleep(){
        System.out.println("ZZZzzzz.... (for 8 hours)");
    }

    abstract void eat(String food);

//    SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

//    GETTERS
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
