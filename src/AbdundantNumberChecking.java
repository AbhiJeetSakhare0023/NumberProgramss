import java.util.Scanner;

public class AbdundantNumberChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num= sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>num)
        {
            System.out.println(num+" is a abundant number");
        }
        else
        {
            System.out.println(num+" is a Not abundant number");
        }
    }
}
