import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        int result=num*num;
        System.out.println(result+" is Square of given number.");

    }
}
