import conv.Converter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        int year = 2017;
        int month = 03;
        int day = 12;
        Converter converter = new Converter();

        System.out.println("_______Default pattern_______");
        System.out.println("The current date : " + "[ "+ converter.convert(time) + " ]");

        System.out.println("_______Custom pattern_______");
        System.out.println("The current date : " + "[ "+ converter.convert(time, "d.MM.yyyy") + " ]");

        System.out.println("_______Custom date_______");
        System.out.println("The custom date : " + "[ "+ converter.convert(year, month, day) + " ]");

        String stringTime = "1.01.2018";
        String pattern = "d.MM.yyyy";
        System.out.println("_______String time_______");
        System.out.println("Date as a string " + "[ "+ stringTime + " ]");
        System.out.println("The time : " + "[ "+ converter.convert(stringTime, pattern) + " ]");

        System.out.println("_______A method with a variable number of parameters of type int______");
        System.out.println(converter.convert(year, month));
    }
}
