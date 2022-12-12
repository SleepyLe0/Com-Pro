public class Human {

    //Instance Field
    private String name;
    private int level;
    private int health;

    //Constructor
    public Human(String name) {
        this.name = name;
        level = 1;
        health = 100;
    }

    // Void method will not return anything
    public void greet() {
        System.out.println("Greeting! " + name);
    }

    public void gainXP() {
        this.health += 50;
        this.level += 1;
    }

    // return the type of int (DON'T FORGET return statement)
    public int increaseLevelByFive() {
        this.health += 50 * 5;
        return this.level += 5;
    }

    public int increaseLevel(int level) {
        this.health += 50 * level;
        return this.level += level;
    }

    public void decreaseHP(int damage) {
        health -= damage;
    }

    // return the type of String
    public String attack(String target) {
        // receive target as parameter
        return "Attacking" + target;
    }

    // What is setter getter?
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //What is override toString?
    @Override
    public String toString() {
        if (health <= 0) {
            return String.format("Human\n%s's Status\nDeath at level : %d\n", name, level);
        }else {
            return String.format("Human\n%s's Status\nLevel : %d\nHealth : %d\n", name, level, health);
        }
    }
}
