public class Conditional {

    public static void main(String[] args) {
        /*
    Syntax
    if (condition | boolean ) {
        // DO or CHECK something if true do this chunk of code
    }

    if (condition | boolean) {
        // the condition (boolean) is true do this chunk of code
    } else if (condition | boolean ) {
        // check the condition true? if true do this chunk of code
    }

     */
        System.out.println(testQuiz2(5));
    }

    public static String testQuiz1() {
        int number = 0;
        /*
         Check if the number is positive or not

         Test Data
         Input Data : 35
         Expected Output: (NUMBER) is positive
         */
        return "";
    }

    public static String testQuiz2(int inputDay) {
        // Input between 1 - 7 return the name of that week day if non matches return "No day matches"
        switch (inputDay) {
            case 1 : return "Sunday";
            case 2 : return "Monday";
            case 3 : return "Tuesday";
            case 4 : return "Wednesday";
            case 5 : return "Thursday";
            case 6 : return "Friday";
            case 7 : return "Saturday";
            default : return "No day matches";
        }
    }


}
