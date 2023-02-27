import java.util.Scanner;

public class PrimeFactorsGivenNumber {
    public static void isPrime(int n) //12
    {
        int d=2; // 3
        while(n>1) // true  , true ,true ,false
        {
            if(n%d==0) // true , true ,false ,true
            {
                System.out.print(d+" "); // 2 , 2 ,3
                n=n/d; // 6 ,3 ,1
            }
            else {
                d++;//3
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt(); // 12
        isPrime(num);
    }
}