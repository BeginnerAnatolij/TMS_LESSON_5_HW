package Lesson5.Loop;

/* Displaying sequence of 7*/
public class Task3 {
    public static void main(String[] args) {
        int number = 7;
        int result = 0;
        int multiplier = 1;
        while (result< 98) {
            result = number * multiplier;
            multiplier++;
            System.out.println(result);
        }
    }
}
