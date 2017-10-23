
public class Main {
    public static void main(String[] args) {
        int b1 = 0b1111000; //120
        int b2 = 0b1111; //17
        int result = b1 + b2;
        System.out.println("Складываем два двочиных числа : " + result);

        int o1 = 04;
        int o2 = 07;
        result = o1 + o2;
        System.out.println("Складываем два восьмеричных числа : " + result);

        result = b1 * o1;
        System.out.println("Складываем двочиное и восьмеричное числа : " + result);

        int x1 = 0x5A3; //1443
        result = o2 + x1;
        System.out.println("Складываем восьмеричное и шестандцатиричное числа : " + result);

        System.out.println();
        //Через касс - обёртку
        System.out.println("Теперь через класс обертку");
        int b;
        int o;
        int x;

        String bS = "101";
        String oS = "03";
        String xS = "5A3";

        b = Integer.parseInt(bS, 2);
        o = Integer.parseInt(oS);
        x = Integer.parseInt(xS, 16);

        result = (b + o)* x;
        System.out.println("Выражение (b + o)* x : " + result);

    }
}
