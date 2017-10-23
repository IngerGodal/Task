import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        String result;

        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();

        result = (number1 > 1000 && number2 > 1000) ? "All" :
                (number1 > 1000 || number2 > 1000) ? "Only one" : "No";

        System.out.println("Сравниваем эти два числа с 1000");
        System.out.println(result);
    }
}
