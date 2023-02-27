import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num=sc.nextInt(); // 145
        int actulNum=num;
        int rem;
        int sum=0;

        while(num!=0) // 1) true,8) true,true, false
        {
            rem=num%10; // 2) 5 ,4,1
            int fact=1; // 3)
            for(int i=1;i<=rem;i++) // 4)
            {
                fact=fact*i; // 5) 120,24,1
            }
            sum=sum+fact; // 6) 120,120+24, 120+24+1=145
            num=num/10; // 7) 14 ,1,0
        }
        if(sum==actulNum) // true
        {
            System.out.println(actulNum+" is a Strong Number.");
        }
        else
        {
            System.out.println(actulNum+" is not a Strong Number.");
        }
    }
}
