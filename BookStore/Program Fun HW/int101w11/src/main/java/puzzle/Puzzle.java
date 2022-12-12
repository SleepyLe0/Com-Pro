package puzzle;

public class Puzzle {
    int low;
    int high;

    public static void main(String[] args) {
        int a=0;
        int b=0;
        int i;
        int m;
        Puzzle x = new Puzzle(-20,20);
        Puzzle y = new Puzzle(0,100);
        for (i=1;i<=10000;i++) {
            a += x.getValue();
        }
        for (m=1;m<=25000;m++) {
            b += y.getValue();
        }
        System.out.println("average of random x : " + a / i);
        System.out.println("average of random y : " + b / m);
    }

    public Puzzle(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int getValue() {
        return (int)(Math.random()*(high-low+1)+low);
    }
}
