import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class esercizio31di1 {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(date);

        String dateCorto = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dateCorto);

        String dateMedio = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dateMedio);

        String dateLargo = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dateLargo);

        String dateCompleto = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dateCompleto);

    }
}