import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{1, 34, 5, 6, 7, 8, 9, 10, 99};
        while (true) {
            System.out.print("Введи число: ");
            try {
                int d = scanner.nextInt();
                double catchedRes1 = intArray[8] / d;
                System.out.println("Результат: " + catchedRes1);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Catching exception: " + e);
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено некорректное значение");
                scanner.nextLine();

            }
        }
    }
}

