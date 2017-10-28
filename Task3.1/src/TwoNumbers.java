import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Введите первое число: ");
        number1 = input.nextInt();
        System.out.println("Введите второе число: ");
        number2 = input.nextInt();

        System.out.println("_______Результат сравнение суммы и разности чисел_______");
        if ((number1 + number2) > (number1 - number2)) {
            System.out.println("Сумма больше чем разность");
        } else {
            System.out.println("Разность больше чем сумма");
        }
    }
}
