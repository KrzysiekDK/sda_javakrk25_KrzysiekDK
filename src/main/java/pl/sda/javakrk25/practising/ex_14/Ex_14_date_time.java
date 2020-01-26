package pl.sda.javakrk25.practising.ex_14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class Ex_14_date_time {

    /**
     * Napisać metodę, która przyjmie "XX.XX.XXXX" i zamieni go na obiekt klasy LocalDate
     * Napisać metodę, która przyjmie "XX:XX:XX" i zamieni go na obiekt klasy LocalTime
     * Napisać metodę, która przyjmie "XXXX_XX_XX, XX:XX:XX.XXX" i zamieni go na obiekt klasy LocalDateTime
     * Napisać metodę która za parametr przyjmuje LocalDate, a zwraca nam datę,
     * będącą poniedziałkiem w tygodniu podanej daty
     *
     * @param args
     */
    public static void main(String[] args) {
        String dateInput = "13.12.2019";
        System.out.println(parseDate(dateInput));
        String timeInput = "13:55:12";
        System.out.println(parseTime(timeInput));
        String dateTimeInput = "2019_09_12, 21:12:45.124";
        LocalDateTime localDateTime = parseDateTime(dateTimeInput);
        System.out.println(localDateTime);


        System.out.println(formatDate(localDateTime));
        System.out.println(formatTime(localDateTime));
        System.out.println(formatDateTime(localDateTime));

        System.out.println(localizedDateExamples(localDateTime));

        System.out.println(getDateOfMondayOfWeek(LocalDate.now()));
    }

    private static LocalDate getDateOfMondayOfWeek(LocalDate date) {
        return date.with(ChronoField.DAY_OF_WEEK, 1);
    }

    private static String localizedDateExamples(LocalDateTime localDateTime) {
        FormatStyle style = FormatStyle.FULL;
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(style);
        return localDateTime.format(formatter);
    }

    // 26 stycznia 2020
    private static String formatDate(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return localDateTime.format(formatter);
    }


    // 13:12:11
    // 4:30pm
    private static String formatTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        return localDateTime.format(formatter);
    }

    private static String formatDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, h 'o''clock'");
        return localDateTime.format(formatter);
    }

    private static LocalDateTime parseDateTime(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd, HH:mm:ss.SSS");
        return LocalDateTime.parse(text, formatter);
    }

    private static LocalTime parseTime(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.parse(text, formatter);
    }

    private static LocalDate parseDate(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(text, formatter);
    }


}
