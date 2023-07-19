package Day_02;

import java.util.HashMap;

public class Pattern
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 7, 4, 3, 6, 4};
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        char ch = 'A';
        for (int i = max; i > 0; i--)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (i <= arr[j])
                {
                    if ((j + 1) % 2 == 0 )
                    {
                        int num=arr[j]-i;
                        if(num%2==0)
                            System.out.print((char)(num+65)+" ");
                        else
                            System.out.print((char)(num+97)+" ");
                    }
                    else
                        System.out.print("* ");

                }
                else
                    System.out.print("  ");
            }
            System.out.println();
            ch++;
        }
    }
}