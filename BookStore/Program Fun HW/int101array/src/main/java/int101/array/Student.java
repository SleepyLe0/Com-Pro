package int101.array;

import java.util.Random;

public class Student {
    private static final int sizeOfId = 99999;
    private static boolean[] allId = new boolean[sizeOfId];
    private int id;
    private String name;

    public Student(String name) {
        this.name = name;
        int b=0;
        for(int a = 0; a < sizeOfId; a++) {
            if(!allId[a]) {
                b = 1;
            }
        }
        int i=1;
        while (i != 0) {
            int x = new Random().nextInt(sizeOfId);
            if (!allId[x]) {
                allId[x] = true;
                id = x;
                i = 0;
            }else if(b == 0) {
                id = -1;
                break;
            }else {
                i++;
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}