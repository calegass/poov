// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner s = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        System.out.println(today.format(formatter));

        LocalDate christmas  = LocalDate.of(2023, Month.DECEMBER, 25);
        System.out.println(christmas.format(formatter));

        LocalTime time_now = LocalTime.now();
        System.out.println(time_now);

        System.out.print("dd/MM/yyyy: ");
        String dataString = s.nextLine();
        LocalDate date = LocalDate.parse(dataString, formatter);
        System.out.println(date.format(formatter));

        String week_day = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("pt", "BR"));
        System.out.println(week_day);
    }
}
/*
Period periodo = Period.of(2, 3, 10);

LocalDate hoje = LocalDate.now();
LocalDate amanha = hoje.plusDays(1);
LocalDate daqui3Semanas = hoje.plusWeeks(3);
LocalDate daqui3Meses = hoje.plusMonths(3);
LocalDate daqui3Anos = hoje.plusYears(3);
LocalDate daqui2Anos3Meses10Dias = hoje.plus(periodo);

LocalDate ontem = hoje.minusDays(1);
LocalDate tresSemanasAtras = hoje.minusWeeks(3);
LocalDate tresMesesAtras = hoje.minusMonths(3);
LocalDate tresAnosAtras = hoje.minusYears(3);
LocalDate doisAnos3Meses10DiasAtras = hoje.minus(periodo);

LocalDate dia10MesAtual = hoje.withDayOfMonth(10);
LocalDate diaHojeMesAbril = hoje.withMonth(4);
LocalDate diaHojeMesAbril2 = hoje.withMonth(Month.APRIL.getValue());
LocalDate diaHojeAno2014 = hoje.withYear(2014);
*/