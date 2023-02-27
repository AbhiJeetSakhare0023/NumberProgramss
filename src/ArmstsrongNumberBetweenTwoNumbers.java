import java.util.Scanner;
import java.lang.Math;
public class ArmstsrongNumberBetweenTwoNumbers
{
    static boolean isArmstrong(int n)
    {
        int digits=0;
        int temp=n;

        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }

        temp = n;
        int rem;
        int sum=0;
        while(temp>0)
        {

            rem = temp % 10;
            sum +=  (Math.pow(rem, digits));

            temp = temp/10;
        }

        if(n==sum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=num1; i<=num2; i++)
        {
            if (isArmstrong(i))
            {
                System.out.print(i + ", ");
            }
        }
    }
}
