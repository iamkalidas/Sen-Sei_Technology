package Day_01;

public class Pattern
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = max; i > 0; i--)
        {
            for (int j = 0; j < arr.length; j++)
            {
                char c = 'A';
                if (j % 2 == 0)
                {
                    if (arr[j] >= i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if (arr[j] >= i)
                        System.out.print(c);
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

