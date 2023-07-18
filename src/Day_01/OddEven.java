package Day_01;
import java.util.*;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2};
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                {
                    count++;
                }
            list.add(count);
            i=i+count-1;
        }
        System.out.println("Enter userInput : ");
        int userInput = sc.nextInt();
        if(userInput==1)
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (i % 2 == 0)
                    System.out.println(list.get(i));
            }
        }
        else
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (i % 2!= 0)
                    System.out.println(list.get(i));
            }
        }
    }
}
