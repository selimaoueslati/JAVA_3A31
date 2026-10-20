
package tn.esprit.gestionzoo.entities;

//20
public class Penguin extends Aquatic {

    protected float swimmingDepth;

    //21
    public Penguin() {
        super();
    }

    //22
    public Penguin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    //23
    @Override
    public String toString() {
        return super.toString() +
                ", swimmingDepth=" + swimmingDepth;
    }
}
