import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        TwoNumbers temp = new TwoNumbers();

        System.out.println("Введите первое число");
        number1 = input.nextInt();
        System.out.println("Введите второе число");
        number2 = input.nextInt();

        System.out.println("_______Решение задачи_______");
        solutionWhile(number1, number2);
        System.out.println("_______Решение задачи через цикл For_______");
        temp.solutionFor(number1, number2);
        System.out.println("_______Решение задачи через цикл DoWhile_______");
        temp.solutionDoWhile(number1, number2);
    }

    public void solutionWhile(int number1, int number2) {
        int limitOfTry;
        int resultMultiplication;
        int countTry;
        int tmp;
        boolean flag;

        countTry = 1;
        limitOfTry = 10;
        tmp = number1;
        flag = false;

        resultMultiplication = number1 * number2;

        while(countTry <= limitOfTry) {
            tmp += number2;

            if (tmp > resultMultiplication) {
                flag = true;
                break;
            }

            countTry++;
        }

        if (flag == true) {
            System.out.print("Цель достигнута! Количество попыток : " + "[ " + countTry + " ]");
        } else {
            System.out.print("Цель не достигнута, попытки исчерпаны...");
        }
    }

    public void solutionFor(int number1, int number2) {
        int limitOfTry;
        int resultMultiplication;
        int countTry;
        int tmp;
        boolean flag;

        limitOfTry = 10;
        tmp = number1;
        flag = false;

        resultMultiplication = number1 * number2;

        for (countTry = 1; countTry <= limitOfTry; countTry++) {
            tmp += number2;

            if (tmp > resultMultiplication) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Цель достигнута! Количество попыток : " + "[ " + countTry + " ]");
        } else {
            System.out.println("Цель не достигнута, попытки исчерпаны...");
        }
    }

    public void solutionDoWhile(int number1, int number2) {
        int limitOfTry;
        int resultMultiplication;
        int countTry;
        int tmp;
        boolean flag;

        countTry = 1;
        limitOfTry = 10;
        tmp = number1;
        flag = false;

        resultMultiplication = number1 * number2;

        do {
            tmp += number2;

            if (tmp > resultMultiplication) {
                flag = true;
                break;
            }
        } while (++countTry <= limitOfTry);

        if (flag == true) {
            System.out.print("Цель достигнута! Количество попыток : " + "[ " + countTry + " ]");
        } else {
            System.out.print("Цель не достигнута, попытки исчерпаны...");
        }
    }
}
