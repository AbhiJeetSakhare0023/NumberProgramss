import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(); // 1234
        int sum=0;
        int rem=0;
        while(num!=0) // true ,true ,true ,true,false
        {
            rem=num%10;  // 4 ,3 ,2 , 1
            sum=sum+rem; // 4 ,4+3 ,4+3+2 , 4+3+2+1=10
            num=num/10;  // 123 ,12 ,1 , 0
        }
        System.out.println("Sum of all digits of given number : "+sum);


    }
}
