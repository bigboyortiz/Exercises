package abstractionexercise;

/**
 *
 * @author lorenzo
 */
abstract class Entity {
    
    String name;
    int power;
    abstract void greet();
    abstract void attack();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
