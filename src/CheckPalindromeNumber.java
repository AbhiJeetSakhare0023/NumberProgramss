import java.util.Scanner;

// 121 = 121 it is a palindrome
public class CheckPalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt(); //121
        int temp=num; // 121
        int rev=0;
        int rem=0;
        while(temp!=0) // true,true ,true ,false
        {
            rem=temp%10; // 1 , 2 ,1
            rev=rev*10+rem; // 1 , 1*10+2 , (1*10+2)*10+1=121
            temp=temp/10; // 12 ,1,0

        }
        if(rev==num)
        {
            System.out.println(num+" is a palindrome number.");
        }
        else
        {
            System.out.println(num+" is a not palindrome number.");
        }

    }
}
