package nl.novi.javaprogrammeren.overerving;

import java.util.Locale;

public class Lion extends Animal {
//    INSTANCE VARIABLES
    String cageName;
    LastFeedingDay day;
    String countryOfOrigin;
    int numberOfChildren;

//    CONSTRUCTORS
    public Lion(String name, Gender gender) {
        super(name, gender);
    }

//    METHODS
    @Override
    public void makeSound(){
        System.out.println("ROAAR");
    }

    @Override
    public void eat(String food) {
        String niceFood = "meat";

        System.out.println("I only eat " + niceFood + ".");

        if (food.toLowerCase(Locale.ROOT).equals(niceFood)){
            System.out.println("So i like this.");
        } else{
            System.out.println("So i dont like this.");
        }
    }

//    SETTERS
    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public void setDay(LastFeedingDay day) {
        this.day = day;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    //    GETTERS
    public String getCageName() {
        return cageName;
    }

    public LastFeedingDay getDay() {
        return day;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }
}
