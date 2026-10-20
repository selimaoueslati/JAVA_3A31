public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    final int nbrCages = 25;
    int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animalCount = 0;
    }

    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City : " + city);
        System.out.println("Number of cages : " + nbrCages);
    }

    //10
    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    //11
    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    //11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    //13
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

    //15
    public boolean isZooFull() {
        return animalCount == nbrCages;
    }

    // Instruction 15 : Comparer deux zoos
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
