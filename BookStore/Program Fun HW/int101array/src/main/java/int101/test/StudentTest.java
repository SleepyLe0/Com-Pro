package int101.test;

import int101.array.Student;

public class StudentTest {

    public static void main(String[] args) {
        testStudent();
    }

    public static void testStudent() {
        final int sizeOfId = 10;
        Student[] students = new Student[sizeOfId];
        for (int i = 0; i < sizeOfId; i++) {
            students[i] = new Student("" + (i + 1));
        }
        for (Student x : students) {
            System.out.println(x);
        }
    }
}
