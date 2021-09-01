package Lesson5.Loop;

/*Displaying squares of numbers fromm ten to eleven inclusive*/
public class Task5 {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            int result = 0;
            result = i * i;
            System.out.println(result);
        }
    }
}
