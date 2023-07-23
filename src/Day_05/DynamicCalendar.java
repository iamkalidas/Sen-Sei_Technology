package Day_05;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Scanner;

public class DynamicCalendar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        System.out.println("\nEnter a month : ");
        int month = sc.nextInt();

        //binding the days with keys.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0,"SUN");
        map.put(1,"MON");
        map.put(2,"TUE");
        map.put(3,"WED");
        map.put(4,"THU");
        map.put(5,"FRI");
        map.put(6,"SAT");

        //getting 1st day of the month
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        System.out.println(firstDayOfMonth);

        //getting year and month
        YearMonth yearMonthObject = YearMonth.of(year, month);

        //Counting days in the month
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Days in "+month+" month : "+daysInMonth);

        //getting input from user for month
        System.out.println("\nEnter a week start day (0:SUN, 1:MON, 2:TUE, 3:WED, 4:THUR, 5:FRI, 6:SAT) : ");
        int weekStartDay = sc.nextInt();
        System.out.println();

        //printing days got from user
        for (int i = weekStartDay ; i <weekStartDay+7 ; i++)
            System.out.print(map.get(i%7)+" ");
        System.out.println();

        int count=1;
        int temp = weekStartDay;

        //getting 1st day of the month
        int firstDay = firstDayOfMonth.getDayOfWeek().getValue();

        //printing spaces before first day of month
        while (temp!=firstDay)
        {
            System.out.print("    ");
            temp++;
            temp=temp%7;
            count++;
        }

        //printing dates
        for (int i = 1; i <= daysInMonth; i++)
        {
            if(i<=9)
                System.out.print(" 0"+i+" ");
            else
                System.out.print(" "+i+" ");
            if (count%7==0)
                System.out.println();
            count++;
        }
    }
}
