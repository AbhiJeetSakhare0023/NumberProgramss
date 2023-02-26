import java.util.Scanner;

public class SumFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower=sc.nextInt();
        int higher = sc.nextInt();
        int sum=0;
        for(int i=lower;i<=higher;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
