package nl.novi.javaprogrammeren.overerving;

import java.util.Locale;

public class Dog extends Animal{
//    INSTANCE VARIABLES
    String nameOwner;
    String favFoodBrand;
    String breed;

//    CONSTRUCTOR
    public Dog(String breed, String name, Gender gender){
        super(name, gender);
        this.breed = breed;
    }

//    METHODS
    @Override
    public void makeSound(){
        System.out.println("BARK!!");
    }

    @Override
    public void eat(String food){
        if(food.toLowerCase().equals(favFoodBrand)){
            System.out.println("Nice food");
        } else{
            System.out.println("Dont like the food");
        }
    }

//    SETTERS
    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setFavFoodBrand(String favFoodBrand) {
        this.favFoodBrand = favFoodBrand;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

//    GETTERS
    public String getNameOwner() {
        return nameOwner;
    }

    public String getFavFoodBrand() {
        return favFoodBrand;
    }

    public String getBreed() {
        return breed;
    }
}
