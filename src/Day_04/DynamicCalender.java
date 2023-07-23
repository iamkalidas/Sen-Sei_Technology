package Day_04;

import java.time.LocalDate;
import java.util.*;

public class DynamicCalender
{
    public static void main(String[] args)
    {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] month = {" ", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start day (in ___ format ) : ");
        String weekDay = sc.nextLine();

        System.out.println("Enter the year : ");
        int y = sc.nextInt();

        System.out.println("Enter the month : ");
        int m = sc.nextInt();

        int startDay=0;
        for(int i=0;i<week.length;i++)
        {
            if (weekDay.equalsIgnoreCase(week[i]))
            {
                startDay = i;
                break;
            }
        }
        if (m>12)
        {
            for (int i=1;i<3;i++)
            {
                System.out.println("Invalid month! \nEnter the month");
                System.out.println();
                m = sc.nextInt();
                if (m<13)
                    break;
                else if(i==2)
                {
                    System.out.println("To many attempts,Try latter!");
                    System.exit(2000);
                }
            }
            System.exit(1000);
        }

        LocalDate localDate = LocalDate.of(y, m, 1);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        int day = dayOfWeek.getValue();
        System.out.println(day);
        System.out.println(y);
        System.out.println(month[m]);

        if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
            days[2] = 29;

        int d=days[m];
        for (int i = 0; i < week.length; i++)
        {
            System.out.print(week[startDay]+" ");
            startDay++;
            if (startDay == week.length)
                startDay=0;
        }
        System.out.println();

        if (day!=7)
        {
            for(int i=1;i<=day-startDay;i++)
                System.out.print("    ");
        }

        if (day == 7)
        {
            day = 0;
            startDay=0;
        }

        for (int j=1;j<=d;j++)
        {
            if (j < 10)
                System.out.print("0" + j + "  ");
            else
                System.out.print(j + "  ");

            if ((j + day-startDay) % 7 == 0)
                System.out.println();
        }
    }
}