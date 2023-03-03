public class SumOfEvenDigitsInNumber {
    public static void main(String[] args) {
        int num=1234;
        int temp=num;
        int lastDigit;
        int sum=0;
        while(num!=0)
        {
            lastDigit=num%10;// 4 , 3 ,2,1
            if(lastDigit%2==0)
            {
                sum=sum+lastDigit;// 4,4+2
            }
            num=num/10;//123 ,12,1,0
        }
        System.out.println("Sum of Even digits of "+temp+" = "+sum);
    }
}
