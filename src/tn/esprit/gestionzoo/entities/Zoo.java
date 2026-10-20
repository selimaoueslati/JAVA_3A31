
package tn.esprit.gestionzoo.entities;

public class Zoo {

    //18
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Nom du zoo invalide");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public Animal[] getAnimals() {
        return animals.clone();
    }

    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City : " + city);
        System.out.println("Number of cages : " + nbrCages);
    }

    //17
    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        if (animal == null || animal.getName() == null) {
            return -1;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animal.getName().equals(animals[i].getName())) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;
        animalCount--;

        return true;
    }

    public boolean isZooFull() {
        return animalCount == nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        }

        return z2;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
