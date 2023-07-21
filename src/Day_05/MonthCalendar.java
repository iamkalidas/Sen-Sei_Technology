package Day_05;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class MonthCalendar
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user for year, month, and the day of the week the month starts
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the week the month starts (e.g., Friday, Saturday, etc.): ");
        String dayName = input.next();

        // Convert the day name to DayOfWeek enum
        DayOfWeek startDayOfWeek = DayOfWeek.valueOf(dayName.toUpperCase());

        // Get the first day of the month
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        // Find the day that matches the user-specified day of the week
        while (firstDayOfMonth.getDayOfWeek() != startDayOfWeek) {
            firstDayOfMonth = firstDayOfMonth.minusDays(1);
        }

        // Print the month calendar
        printMonthCalendar(firstDayOfMonth.getYear(), firstDayOfMonth.getMonthValue());
    }

    private static void printMonthCalendar(int year, int month) {
        // Get the YearMonth object for the given year and month
        YearMonth yearMonth = YearMonth.of(year, month);

        // Print the month and year
        System.out.println(yearMonth.getMonth() + " " + yearMonth.getYear());

        // Print the header for the days of the week starting from the user-specified day
        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        int startDayIndex = yearMonth.atDay(1).getDayOfWeek().getValue() - 1;
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-5s", daysOfWeek[(startDayIndex + i) % 7].getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        }
        System.out.println();

        // Get the number of days in the month
        int daysInMonth = yearMonth.lengthOfMonth();

        // Print the days of the month
        int currentDay = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && j < startDayIndex) || currentDay > daysInMonth) {
                    System.out.print("     ");
                } else {
                    System.out.printf("%-5d", currentDay);
                    currentDay++;
                }
            }
            System.out.println();
        }
    }
}
