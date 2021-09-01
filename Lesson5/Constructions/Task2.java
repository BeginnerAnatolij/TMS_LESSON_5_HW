package Lesson5.Constructions;

/*Displaying the name of the season by the number of the month using if-else-if
 */
public class Task2 {
    public static void main(String[] args) {
        int numberOfAMonth = 2;
        if (numberOfAMonth == 1 || numberOfAMonth == 2 || numberOfAMonth == 12) {
            System.out.println("Зима");
        } else if (numberOfAMonth == 3 || numberOfAMonth == 4 || numberOfAMonth == 5) {
            System.out.println("Весна");
        } else if (numberOfAMonth == 6 || numberOfAMonth == 7 || numberOfAMonth == 8) {
            System.out.println("Лето");
        } else if (numberOfAMonth == 9 || numberOfAMonth == 10 || numberOfAMonth == 11) {
            System.out.println("Осень");
        } else {
            System.out.println(("Такого месяца не существует! Введите число от 1 до 12"));
        }

    }
}

