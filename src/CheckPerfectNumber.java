import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();//6
        int actulNum=num;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0) // true
            {
                sum=sum+i; // 1 ,1+2,1+2+3=6
            }
        }
        if(sum==actulNum)
        {
            System.out.println(actulNum+" is a perfect number.");
        }
        else
        {
            System.out.println(actulNum+" is Not a perfect number.");
        }
    }
}
