public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);


        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(crocodile);
    }
}
