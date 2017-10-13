package abstractionexercise;

/**
 *
 * @author lorenzo
 */
public class Merchant extends Entity {
    
    int id = 2;

    void greet() {
        System.out.println(this.name 
                + " says, 'Good day! come in and take a look at my wares.");
    }
    
    void attack() {
        System.out.println("I'd rather sell my weapons than use them!");
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
