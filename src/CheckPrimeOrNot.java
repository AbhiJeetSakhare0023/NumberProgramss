import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();

        if(num==1 || num==0)
        {
            System.out.println(num + " is not prime.");
        }
        else
        {
            int count = 0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0) // it produces remainder like num divided by i
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(num+" is prime Number");
            }
        }
    }
}
