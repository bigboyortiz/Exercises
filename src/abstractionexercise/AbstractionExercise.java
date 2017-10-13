package abstractionexercise;

/**
 *
 * @author lorenzo
 */
public class AbstractionExercise {

    public static void main (String args[]) {
        Entity e = create(1, "hehe", 40);
        
        e.greet();
        e.attack();
    }
    
    public static Entity create(int id, String name, int power) {
        MageKnight w = new MageKnight();
        
        w.setId(id);
        w.setName(name);
        w.setPower(power);
        
        return w;
    }
    
}
