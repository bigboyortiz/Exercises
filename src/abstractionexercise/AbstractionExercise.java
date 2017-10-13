package abstractionexercise;

/**
 *
 * @author lorenzo
 */
public class AbstractionExercise {

    public static void main (String args[]) {
        AbstractionExercise ae = new AbstractionExercise();
        
        Entity e = ae.create(2, "bdnwdk", 1000);
        
        e.greet();
        e.attack();
    }
    
    public Entity create(int id, String name, int power) {
        
        if (id == 0) {
            Entity e = new Warrior();
            e.setName(name);
            e.setPower(power);
            return e;
        } else if (id == 1) {
            Entity e = new Wizard();
            e.setName(name);
            e.setPower(power);
            return e;
        } else if (id == 2) {
            Entity e = new Merchant();
            e.setName(name);
            e.setPower(power);
            return e;
        } else if (id == 4) {
            Entity e = new MageKnight();
            e.setName(name);
            e.setPower(power);
            return e;
        } else {
            return null;
        }
    }
    
}
