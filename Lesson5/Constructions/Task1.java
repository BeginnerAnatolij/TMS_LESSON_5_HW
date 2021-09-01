package Lesson5.Constructions;
/*Displaying the name of the season by the number of the month using switch-case
 */

public class Task1 {

    public static void main(String[] args) {
        int numberOfAMonth = 7;
        switch (numberOfAMonth) {
            case 1, 2, 12: {
                System.out.println("Зима");
            }
            break;
            case 3, 4, 5: {
                System.out.println("Весна");
            }
            break;
            case 6, 7, 8: {
                System.out.println("Лето");
            }
            break;
            case 9, 10, 11: {
                System.out.println("Осень");
            }
            break;
            default: {
                System.out.println("Такого месяца не существует! Введите число от 1 до 12");
            }
        }
    }
}
