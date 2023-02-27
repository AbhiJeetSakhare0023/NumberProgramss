import java.util.Scanner;

public class CheckHarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();//24
        int actulNum=num;
        int rem;
        int sum=0;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(actulNum%sum==0)
        {
            System.out.println(actulNum+" is a harshad Number");
        }
        else
        {
            System.out.println(actulNum+" is Not a harshad Number");
        }
    }
}
