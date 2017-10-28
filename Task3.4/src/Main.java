import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int temp;

        System.out.println("Введите любое число: ");
        number = input.nextInt();
        temp = 0;

        System.out.println("4 последующих числа, чей остаток от деления на 3 равен 2");
        for (int i = 1;; i++) {
            int currentNumber = number + i;

            if (currentNumber % 3 == 2) {
                System.out.println(currentNumber);
                temp++;
            } else {
                continue;
            }

            if (temp == 4) {
                break;
            }
        }
    }
}
