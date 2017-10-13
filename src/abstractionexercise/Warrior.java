package abstractionexercise;

/**
 *
 * @author lorenzo
 */
public class Warrior extends Entity {
    
    int id = 0;
    
    public Warrior() {
        
    }

    void greet() {
        System.out.println(this.name + " greets.");
    }
    
    void attack() {
        System.out.println(this.name 
                + " swings an axe and deals " 
                + this.power*2 + " damage.");
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
