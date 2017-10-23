
public class Main {
    public static void main(String[] args)
    {
        int numberInt = 235;
        byte numberByte = (byte) numberInt; // 235 выходит за пределы значений, 235 - 256 = -21 ( 2^8, где 8 - занимаемое место в памяти)
        System.out.println("Переменная типа int : " + numberInt + " / Приводим её к типу byte -> " + numberByte);

        long numberLong = 48L;
        numberInt = (int) numberLong; // 48 не выходит за предел значений
        System.out.println("Сужение типа из long в int без выхода за предел значений : " + numberInt);

        int sum = numberInt + numberByte; //Результат не явно будет приведен к int
        System.out.println("Сложение переменных типа int и byte : " + sum + " / Результат неявно приводится к типу int");

        float numberFloat = 2.03f;
        double numberDouble;

        numberDouble = numberFloat + numberInt * numberByte;
        System.out.println("Результат вычисления выражения numberFloat + numberInt * numberByte = " + numberDouble + " / Значение приводится к типу double");

        int a = 230;
        long b = 4500L;
        float c = 1.05f;

        byte result = (byte) (a + c * b / a); // Предполагаю -6
        System.out.println("Результат вычисления выражения a + c * b / a : " + result + " / Результат сужается до типа byte");
    }
}

