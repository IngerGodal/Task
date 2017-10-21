import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();

        System.out.println("_______Побитовые операторы_______");
        //Эквивалентно умножению на 2 в степени числа смещения
        System.out.println("_______Беззнаковый сдвиг влево_______");
        System.out.println("Current number1 = " + number1);
        System.out.println("Current number2 = " + number2);
        System.out.println("number1 << 1 : " + (number1 << 1));
        System.out.println("number2 << 1 : " + (number2 << 1));

        //Эквивалентно делению на 2 в степени числа мещения
        System.out.println("_______Сдвиг вправо с учётом знака_______");
        System.out.println("Current number1 = " + number1);
        System.out.println("Current number2 = " + number2);
        System.out.println("number1 >> 1 : " + (number1 >> 1));
        System.out.println("number2 >> 1 : " + (number2 >> 1));

        //Эквивалентно беззнаковому делению на 2 в степени числа смещения
        System.out.println("_______Сдвиг вправо без учёта знака_______");
        System.out.println("Current number1 = " + number1);
        System.out.println("Current number2 = " + number2);
        System.out.println("number1 >>> 1 : " + (number1 >>> 1));
        System.out.println("number2 >>> 1 : " + (number2 >>> 1));

        System.out.println("_______Переворачивание числа_______");
        System.out.println("Current number1 = " + number1);
        System.out.println("Current number2 = " + number2);
        System.out.println("~number1 : " + (~number1));
        System.out.println("~number2 : " + (~number2));
        System.out.println();


        System.out.println("_______Работа с Integer_______");
        System.out.println("Current number = " + number1);
        System.out.println("Integer number1 << 1 : " + Integer.toBinaryString(Integer.rotateLeft(number1, 1)));
        System.out.println("Integer number1 >> 1 : " + Integer.toBinaryString(Integer.rotateRight(number1, 1)));
    }
}
