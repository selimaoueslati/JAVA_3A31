
package tn.esprit.gestionzoo.entities;

//20
public class Terrestrial extends Animal {

    protected int nbrLegs;

    //21
    public Terrestrial() {
        super();
    }

    //22
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    //23
    @Override
    public String toString() {
        return super.toString() +
                ", nbrLegs=" + nbrLegs;
    }
}
