package abstractionexercise;

/**
 *
 * @author lorenzo
 */
public class Wizard extends Entity {
    
    int id = 1;

    void greet() {
        System.out.println(this.name + " says, 'Greetings.'");
    }
    
    void attack() {
        System.out.println(this.name 
                + " unleashes a wave of fire that burns for " 
                + this.power*5 + " damage.");
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
