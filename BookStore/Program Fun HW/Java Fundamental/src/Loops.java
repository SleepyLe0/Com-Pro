import java.util.Arrays;
import java.util.Random;

public class Loops {

    public static void main(String[] args) {
        // Write the program that print all values in array
        int[] number = { 123,456,789,321,543,765,987 };
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        int x = new Random().nextInt(101);
        int y = new Random().nextInt((100 - 50) + 1) + 50;

        System.out.println(x);
        System.out.println(y);

        int[] randomSet = new int[5];
        for (int i = 0; i < randomSet.length; i++) {
            randomSet[i] = new Random().nextInt(randomSet.length);
        }
        System.out.println(Arrays.toString(randomSet)); // Array of random integer
        testQuiz1();
        System.out.println(testQuiz2(randomSet));
    }

    public static void testQuiz1() {
        // Write program that print number 1 - 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static int testQuiz2(int[] randomSet) {
        // Write the program that read sets of integers, then return the sum of even integer
        int sum = 0;
        for (int i = 0; i < randomSet.length; i++) {
            if (randomSet[i]%2 == 0) {
                sum += randomSet[i];
            }
        }
        return sum;
    }
}
