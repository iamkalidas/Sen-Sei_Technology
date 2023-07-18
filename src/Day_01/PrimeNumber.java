package Day_01;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++)
            if(num%i==0)
            {
                isPrime = false;
                break;
            }

        if(isPrime)
            System.out.printf("prime number");
        else
            System.out.printf("Not prime");
    }
}
