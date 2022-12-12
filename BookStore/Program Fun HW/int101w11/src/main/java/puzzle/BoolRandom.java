package puzzle;

public class BoolRandom {
    double x;
    int rate;
    int random;

    public static void main(String[] args) {
        BoolRandom a = new BoolRandom(0.5);
        int roll = 10;
        for(int i=1;i<=roll;i++) {
            System.out.println("----------------------------- Gacha" + i + " -----------------------------");
            System.out.println("Is that a good character : " + a.getValue());
            System.out.println("You got character : top" + a.random);
        }
    }

    public BoolRandom(double x) {
        if(x > 1) {
            this.x = 1;
        }else if(x < 0) {
            this.x = 0;
        }else {
            this.x = x;
        }
    }

    public boolean getValue() {
        rate = (int)(x * 100);
        random = (int)(Math.random() * 101);
        if(rate == 0) {
            return random < rate;
        }else {
            return random <= rate;
        }
    }
}
