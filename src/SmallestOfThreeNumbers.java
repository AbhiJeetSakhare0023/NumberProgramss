import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 :");
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3)
        {
            System.out.println(num1 + " is a Smallest of three numbers. ");
        }
        else if (num2<num3 && num2<num1)
        {
            System.out.println(num2 + " is a Smallest of three numbers. ");

        }
        else
        {
            System.out.println(num3 + " is a Small10est of three numbers. ");
        }
    }
}
