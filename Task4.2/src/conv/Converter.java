package conv;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {
    private final static String DEFAULT_PATTERN = "yyyy MMM dd";
    private String lastMethod;

    public String convert(long time) {
        lastMethod = "convert(long time)";
        Date date = new Date(time);
        DateFormat dateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        String resultDate = dateFormat.format(date);
        return resultDate;
    }

    public String convert(long time, String pattern) {
        lastMethod = "convert(long time, String pattern)";
        Date date = new Date(time);
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        String resultDate = dateFormat.format(date);
        return resultDate;
    }

    public String convert(int year, int month, int day) {
        lastMethod = "convert(int year, int month, int day)";
        Date date = new Date((year - 1900), month, day);
        DateFormat dateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        String resultDate = dateFormat.format(date);
        return resultDate;
    }

    public String convert(int ...values) {
        return "convert(int ...values)";
    }

    public long convert(String time, String pattern) {
        lastMethod = "convert(String time, String pattern)";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        long t = 0L;
        try {
            Date resultDate = dateFormat.parse(time);
            t = resultDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t;
    }

    public String getLastMethod() {
        return lastMethod;
    }
}
