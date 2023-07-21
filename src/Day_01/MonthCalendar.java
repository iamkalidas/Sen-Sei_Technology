package Day_01;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class MonthCalendar
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user for year, month, and day
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        // Create LocalDate object using the user input
        LocalDate date = LocalDate.of(year, month, day);

        // Get the YearMonth object for the given date
        YearMonth yearMonth = YearMonth.from(date);

        // Print the month calendar
        printMonthCalendar(yearMonth);
    }

    private static void printMonthCalendar(YearMonth yearMonth) {
        // Get the number of days in the month
        int daysInMonth = yearMonth.lengthOfMonth();

        // Print the month and year
        System.out.println(yearMonth.getMonth() + " " + yearMonth.getYear());

        // Print the header for the days of the week
        System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");

        // Calculate the day of the week for the first day of the month (1 - Monday, 7 - Sunday)
        int startDayOfWeek = yearMonth.atDay(1).getDayOfWeek().getValue();

        // Print leading spaces for the first week
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%-5d", day);

            // Move to the next line if it's Sunday
            if (startDayOfWeek == 7) {
                System.out.println();
                startDayOfWeek = 1;
            } else {
                // Otherwise, move to the next
                startDayOfWeek++;
            }
        }
    }
}
