import java.util.Arrays;

public class Main {

    /* Today you'll learn
    *** WHAT YOU SHOULD KNOW ***
    1) Data type (int String float double boolean)
    2) Conditional (if)
    3) Operation and Logic (+,-,*,/, == , !=)
    4) Iteration (Loop)

    a) Java OOP fundamental
    b) What is object?
    c) Instance Field
    d) Constructor
    e) Method
    f) What is setter getter? And why you need to use them.
    g) @Override toString
    h) Arrays (Primitive type and Object type)
     */

    public static void main(String[] args) {
        // Building object syntax VERY IMPORTANT
        Human h1 = new Human("SleepyLeo");
        Vampire v1 = new Vampire("Alucard");
        h1.increaseLevel(74);
        System.out.println(h1);
        v1.increaseLevel(99);
        System.out.println(v1);
        System.out.println(v1.greet(h1.getName()));
        System.out.println(v1.attack(h1));
        System.out.println(h1);
        System.out.println(v1);
    }

    public static void testArray() {
        // Primitive Type Array : int[] String[] boolean[]

        // This is Empty Array
        int[] arr1 = new int[10];
        // Create an array and assign the index at the same time
        int[] arr2 = {1,2,3,4,5,6,7,8,};

        //What will print out?
        System.out.println(arr1);


        System.out.println(arr1[1]);
        System.out.println(arr2[2]);

        // What if it's array of Object?
        Vampire[] vampireGang = new Vampire[10];
        System.out.println(Arrays.toString(vampireGang));
    }
}