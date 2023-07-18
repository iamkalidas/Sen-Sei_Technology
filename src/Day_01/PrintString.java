package Day_01;

import java.util.Arrays;
import java.util.Scanner;

public class PrintString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        System.out.println(Arrays.toString(strArray));
        String evenString = "";
        for (int i =0;i< strArray.length;i++)
        {
            if(strArray[i].length()>2)
            {
                if(i%2==0)
                    evenString += strArray[i] + " ";
                else
                    evenString += strArray[i].toUpperCase() + " ";
            }
        }
        System.out.println(evenString);
    }
}
