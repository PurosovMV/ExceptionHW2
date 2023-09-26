import java.util.InputMismatchException;
import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(enterFloat());

    }

    public static float enterFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введи любое дробное число типа float: ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено некорректное значение");
                scanner.nextLine();

            }
        }
    }
}
