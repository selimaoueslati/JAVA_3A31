
package tn.esprit.gestionzoo.entities;

//20
public class Dolphin extends Aquatic {

    protected float swimmingSpeed;

    //21
    public Dolphin() {
        super();
    }

    //22
    public Dolphin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    //23
    @Override
    public String toString() {
        return super.toString() +
                ", swimmingSpeed=" + swimmingSpeed;
    }

    //24
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
