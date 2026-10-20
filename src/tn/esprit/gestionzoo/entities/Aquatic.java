
package tn.esprit.gestionzoo.entities;

//20
public class Aquatic extends Animal {

    protected String habitat;

    //21
    public Aquatic() {
        super();
    }

    //22
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    //23
    @Override
    public String toString() {
        return super.toString() +
                ", habitat='" + habitat + "'";
    }

    //24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
