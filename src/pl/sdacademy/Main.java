package pl.sdacademy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Dokumentacja budowy patternu:
        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html


        // Obiekt typu Date -> na format przyjazny (string)
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.YYYY");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

        Date today = new Date();

        System.out.println(today);
        System.out.println(dateFormatter.format(today) + " " + timeFormatter.format(today));

        // format przyjazny (String) -> Date()

        // pojedynczo
        String myDate = "18.02.1999";
        String myTime = "03:26:53";
        Date parsedDate = dateFormatter.parse(myDate);
        Date parsedTime = timeFormatter.parse(myTime);
        System.out.println(parsedDate);
        System.out.println(parsedTime);

        // wspolnie
        String myDateTime = "18.02.1989 03:26:53";
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
        System.out.println(dateTimeFormatter.parse(myDateTime));
    }
}
