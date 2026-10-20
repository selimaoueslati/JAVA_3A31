
package tn.esprit.gestionzoo.main;

//19
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 25);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(crocodile);

        System.out.println("Ajout lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout elephant : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout crocodile : " + myZoo.addAnimal(crocodile));

        System.out.println("Liste des animaux :");
        myZoo.displayAnimals();

        System.out.println("Recherche lion : " + myZoo.searchAnimal(lion));

        Animal lion2 = new Animal("Felidae", "Lion", 5, true);
        System.out.println("Recherche lion2 : " + myZoo.searchAnimal(lion2));

        System.out.println("Ajout lion2 : " + myZoo.addAnimal(lion2));

        System.out.println("Suppression elephant : " + myZoo.removeAnimal(elephant));

        System.out.println("Animaux restants :");
        myZoo.displayAnimals();

        for (int i = 0; i < 25; i++) {
            Animal animal = new Animal("Family", "Animal" + i, 2, true);
            System.out.println("Ajout Animal" + i + " : " + myZoo.addAnimal(animal));
        }

        System.out.println("Zoo plein : " + myZoo.isZooFull());

        Zoo zoo2 = new Zoo("Zoo 2", "Sousse", 25);

        zoo2.addAnimal(lion);
        zoo2.addAnimal(elephant);

        Zoo grandZoo = myZoo.comparerZoo(myZoo, zoo2);

        System.out.println("Zoo avec le plus d'animaux : " + grandZoo.getName());

        //18
        Animal animalTest = new Animal("Felidae", "Tiger", -5, true);
        System.out.println(animalTest);

        Zoo zooTest = new Zoo("", "Tunis", 25);
        zooTest.setName("Zoo Test");
        System.out.println(zooTest.getName());
    }
}
