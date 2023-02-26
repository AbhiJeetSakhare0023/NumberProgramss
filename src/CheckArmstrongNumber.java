import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // take only 3 digit number
        
        System.out.println("Enter Number:");
        int num=sc.nextInt(); // 371
        int temp=num;
        int rem;
        int sum=0;
        while (num!=0)//true ,true ,true,false
        {
            rem=num%10;//1 ,7 ,3
            sum=sum+(rem*rem*rem); // 1 ,1+7*7*7 ,(1+7*7*7)+3*3*3 = 1+343+27=371
            num=num/10; // 37,3,0
        }
        if(temp==sum)
        {
            System.out.println(temp+" is Armstrong Number");
        }
        else
        {
            System.out.println(temp+" is not Armstrong Number");
        }

    }
}
