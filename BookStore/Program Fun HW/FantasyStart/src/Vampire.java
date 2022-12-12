public class Vampire {
    /*
    Vampire will have 3 properties
    1. name
    2. level
    3. health
     */
    private String name;
    private int level;
    private int health;

    /*
    This Constructor will
    a) receive name as parameter
    b) level will start at 1
    c) health = 100
     */
    public Vampire(String name) {
        this.name = name;
        level = 1;
        health = 100;
    }

    public String greet(String target) {
        return "Hello! " + target + "\n";
    }

    /* Method attack will
    a) return a String type
    b) receive Human (Object) as parameter
    c) decrease that human's health by (VAMPIRE LEVEL * 10) and return String in the format (Arrrrrr! Die (HUMAN-NAME) )
    d) if human's level is higher than vampire's level
     d.1) decrease vampire's health by (HUMAN LEVEL * 10) and
     d.2) return this format instead: (He's too Strong!)
     */
    public String attack(Human human) {
        if (human.getLevel() > level) {
            health -= human.getLevel()*10;
            return "He's too Strong!\n";
        }else {
            human.decreaseHP(level*10);
            if (human.getHealth() <= 0) {
                increaseLevel(human.getLevel());
            }
            return "Arrrrrr! Die " + human.getName() + "\n";
        }
    }

    public void increaseLevel(int level) {
        this.health += level * 50;
        this.level += level;
    }

    // INSERT SETTER GETTER HERE
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

    // OVERRIDE toString HERE

    @Override
    public String toString() {
        if (health <= 0) {
            return String.format("Vampire\n%s's Status\nDeath at level : %d\n", name, level);
        }else {
            return String.format("Vampire\n%s's Status\nLevel : %d\nHealth : %d\n", name, level, health);
        }
    }
}
