import java.util.Scanner;

public class ReverseGivenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 263
        int rem = 0;
        int rev = 0;
        while(num!=0) // true,true,true ,false
        {
            rem=num%10; // 3 , 6 ,2
            rev=rev*10+rem; // 3 ,3*10+6 , (3*10+6)*10 +2
            num=num/10; // 26 ,2 ,0
        }
        System.out.println("Reverse of Given number is :"+rev);
    }
}
