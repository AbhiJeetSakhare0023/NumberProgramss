import java.util.Scanner;

public class PrimeNumberWithinGivenRange {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int higher = sc.nextInt();

        for (int i = lower; i <= higher; i++) {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n)
    {

        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
