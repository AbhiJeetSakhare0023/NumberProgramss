import java.util.Scanner;

public class CheckFriendlyPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<num1;i++)
        {
            if(num1%i==0)
            {
                sum1=sum1+i;
            }
        }
        for(int j=1;j<num2;j++)
        {
            if(num2%j==0)
            {
                sum2=sum2+j;
            }
        }
        if((num1/sum1)==(num2/sum2))
        {
            System.out.println(num1 +" "+num2+" are friendly pair");
        }
        else
        {
            System.out.println("Not");
        }

    }
}
