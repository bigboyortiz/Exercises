package abstractionexercise;

/**
 *
 * @author lorenzo
 */
public class MageKnight extends Entity {
    
    int id = 3;

    void greet() {
        System.out.println(this.name 
                + " remains silent.");
    }
    
    void attack() {
        System.out.println("With an enchanted blade, " 
                + this.name + " hits for " 
                + this.power*4 + " damage.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
