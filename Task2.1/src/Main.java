import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();
        System.out.println();

        System.out.println("_______Basic arithmetic operations_______");
        System.out.println("Sum number1 and number2: " + (number1 + number2));
        System.out.println("Difference number1 and number2: " + (number1 - number2));
        System.out.println("Division number1 and number2: " + (1.0 * number1 / number2));
        System.out.println("Modulo 2 number1 and number2: " + (number1 % 2) + " and " + (number2 % 2));
        System.out.println("_______Increment and decrement_______");
        System.out.println("Prefix increment number1: " + (++number1) + " / current number1 = " + number1);
        System.out.println("Postfix increment number1: " + (number1++) + " / current number1 = " + number1);
        System.out.println("Prefix decrement number1: " + (--number1) + " / current number1 = " + number1);
        System.out.println("Postfix decrement number1: " + (number1--) + " / current number1 = " + number1);

        System.out.println("_______Operation +=_______");
        for ( int i = 0; i < 5; i++)
        {
            System.out.println("Current number1 = " + number1 + " / number1 += " + i + " : " + (number1 += i));
        }
    }
}
