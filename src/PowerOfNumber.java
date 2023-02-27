import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt(); // 2
        System.out.println("Enter power of that number:");
        int toThePower=sc.nextInt(); // 3

        int pow=1;
        for(int i=1;i<=toThePower;i++) // 1,2,3,4
        {
           pow=pow*num; // 1*2,2*2,,4*2
        }
        System.out.println("Result = "+pow); // 8
    }
}
