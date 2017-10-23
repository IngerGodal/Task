
public class Main {
    public static void main(String[] args)
    {
        String booleanString1 = "true";
        String booleanString2 = "TRUE";
        String booleanString3 = "tRue";
        String booleanString4 = "True";

        boolean boolean1 = Boolean.parseBoolean(booleanString1);
        boolean boolean2 = Boolean.parseBoolean(booleanString2);
        boolean boolean3 = Boolean.parseBoolean(booleanString3);
        boolean boolean4 = Boolean.parseBoolean(booleanString4);

        System.out.println("Строка : " + booleanString1 + " -> в значение типа boolean : " + boolean1);
        System.out.println("Строка : " + booleanString2 + " -> в значение типа boolean : " + boolean2);
        System.out.println("Строка : " + booleanString3 + " -> в значение типа boolean : " + boolean3);
        System.out.println("Строка : " + booleanString4 + " -> в значение типа boolean : " + boolean4);
    }
}
