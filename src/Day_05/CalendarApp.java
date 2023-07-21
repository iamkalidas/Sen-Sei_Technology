package Day_05;

import java.time.LocalDate;
import java.util.Scanner;

public class CalendarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Get the current month and year
            int currentMonth = currentDate.getMonthValue();
            int currentYear = currentDate.getYear();

            // Display the calendar header
            System.out.println("\n" + currentMonth + " - " + currentYear);

            // Display the calendar body
            System.out.println("Mo Tu We Th Fr Sa Su");

            // Find the first day of the month
            LocalDate firstDayOfMonth = LocalDate.of(currentYear, currentMonth, 1);
            int dayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

            // Print leading spaces before the first day of the month
            for (int i = 1; i < dayOfWeek; i++) {
                System.out.print("   ");
            }

            // Print the days of the month
            int daysInMonth = firstDayOfMonth.lengthOfMonth();
            for (int i = 1; i <= daysInMonth; i++) {
                System.out.printf("%2d ", i);

                // New line after each Saturday
                if ((dayOfWeek + i - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();

            // Ask the user for navigation input
            System.out.println("Enter 'p' to see the previous month, 'n' for the next month, or 'q' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("p")) {
                currentDate = currentDate.minusMonths(1);
            } else if (input.equalsIgnoreCase("n")) {
                currentDate = currentDate.plusMonths(1);
            } else if (input.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }

        System.out.println("Thank you for using the CalendarApp!");
    }
}
