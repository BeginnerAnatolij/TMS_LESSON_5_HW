package Lesson5.Loop;

import java.util.Scanner;

/*Displaying the sum of all numbers from 1 to the entered number from user*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int number = scanner.nextInt();
        int result = 0;
        for(int i = 1; i < number; i++ ){
            result= result + i;

        }
        System.out.println(result);
    }
}
