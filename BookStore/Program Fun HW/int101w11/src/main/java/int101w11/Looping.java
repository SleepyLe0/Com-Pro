package int101w11;

public final class  Looping {

    public static String generating(int count){
        String result = "";
        for (int i = 0, inc = 1, current = 0, step =0; i < count; i++) {
            result += current + " ";
            step++;
            if (step==11) { step = 0; inc *= 10; }
            current += inc;
        }
        return result;
    }
}