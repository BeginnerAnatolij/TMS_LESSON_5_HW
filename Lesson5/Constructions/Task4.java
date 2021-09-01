package Lesson5.Constructions;

/* Displaying the characteristics of weather by temperature*/
public class Task4 {
    public static void main(String[] args) {
        int temperature = -20;
        if (temperature > -5) {
            System.out.println("Тепло");
        } else if (temperature > -20 && temperature <= -5) {
            System.out.println("Нормально!");
        } else if (temperature <= -20) {
            System.out.println("Холодно!");
        }
    }
}
