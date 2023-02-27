import java.util.Scanner;

public class CheckAutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt(); // 5
        int square=num*num;
        int last_digit;
        for(int i=1;i<=square;i++)
        {
            last_digit=square%10;
            if(last_digit==num)
            {
                System.out.println(num+" is a automorphic number");
            }
            else {
                System.out.println(num+" is Not a automorphic number");
            }
            break;

        }
    }
}
