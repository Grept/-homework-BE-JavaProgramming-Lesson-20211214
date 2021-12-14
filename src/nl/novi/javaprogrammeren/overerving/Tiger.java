package nl.novi.javaprogrammeren.overerving;

import java.util.Locale;

public class Tiger extends Animal{
//    INSTANCE VARIABLES
    String cageName;
    LastFeedingDay day;
    String countryOfOrigin;
    int numberOfStripes;

//    CONSTRUCTORS
    public Tiger (String name, Gender gender){
        super(name, gender);
    }

//    METHODS
    @Override
    public void makeSound(){
        System.out.println("GROWL!");
    }

    @Override
    public void eat(String food){
        String niceFood = "chicken";
        System.out.println("I only eat " + niceFood);

        if(food.toLowerCase().equals(niceFood)){
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

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
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

    public int getNumberOfStripes() {
        return numberOfStripes;
    }
}
