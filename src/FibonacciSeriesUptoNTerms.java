import java.util.Scanner;

public class FibonacciSeriesUptoNTerms {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms :");
        int n= sc.nextInt();
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for(int i=1;i<=n;i++)  // i=2,
        {
            int num3=num1+num2; // 1,2
            System.out.print(num3+" "); // 1,2 printed
            num1=num2; // now num1=1 ,
            num2=num3; // here num2=1
        }
    }
}
