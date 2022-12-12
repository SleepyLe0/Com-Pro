import java.util.Arrays;
public class TestDroid {
    public static void main(String[] args) {
        testDroid();
        testFactory();
    }

    public static void testDroid() {
        Droid d1 = new Droid("Gunny");
        Droid d2 = new Droid(null);
        System.out.println(d1.performTask("Masturbation"));
        System.out.println(d1.performTask("Masturbation"));
        System.out.println(d1.performTask("Masturbation"));
        System.out.println(d1.performTask("Masturbation"));
        System.out.println(d1.performTask("Masturbation"));
        System.out.println(d1.performTask("Masturbation"));
        System.out.println(d2.performTask("Study"));
        System.out.println(d2.performTask("Eating"));
        System.out.println(d2.performTask("Running"));
        d1.chargeBattery(0);
        d2.chargeBattery(100);
        System.out.println(d1);
        System.out.println(d2);
    }

    public static void testFactory() {
        Factory f1 = new Factory("Gunnie");
        Factory f2 = new Factory("");
        System.out.println(f1.createDroid("g1"));
        System.out.println(f1.createDroid(""));
        System.out.println(f1.createDroid(null));
        System.out.println(f2.createDroid("ma"));
        System.out.println(f2.createDroid("fuk"));
        System.out.println(f2.createDroid(""));
        System.out.println(Arrays.toString(f1.getAllVersion()));
        System.out.println(Arrays.toString(f2.getAllVersion()));
        System.out.println(f1.getDroid(2));
        System.out.println(f2.getDroid(3));
        System.out.println(f1);
        System.out.println(f2);
    }
}
