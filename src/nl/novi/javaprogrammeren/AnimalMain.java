package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.*;

import java.util.ArrayList;

public class AnimalMain {
    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */

    public static void main(String[] args) {
        Lion lionOne = new Lion("Mufasa", Gender.MALE);

        lionOne.move();
        lionOne.sleep();
        lionOne.eat("beans");

        Tiger tigerOne = new Tiger("Tom", Gender.MALE);

        tigerOne.move();
        tigerOne.sleep();
        tigerOne.eat("Chicken");
        System.out.println("Tiger " + tigerOne.getName() + " is a " + tigerOne.getGender());

        Dog dogOne = new Dog("Schnauzer", "Bibi", Gender.FEMALE);

        dogOne.makeSound();

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(lionOne);
        animals.add(tigerOne);
        animals.add(dogOne);

        System.out.println("\n");

        for (Animal a : animals){
            System.out.println(a.getName());
        }


    }
}


