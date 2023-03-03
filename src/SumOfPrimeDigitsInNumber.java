public class SumOfPrimeDigitsInNumber {
    public static void main(String[] args) {
        int num=123456;
        int lastDigit;
        int sum=0;// 5,8,10
        while(num>1) {
            int count=0;//3 ,1,2,1,1
            lastDigit = num % 10;//6 5 4 3 2 1
            for(int i=2;i<=lastDigit;i++)
            {
                if(lastDigit%i==0)
                {
                    count++;// 1,2,3: 1 :2 :1:
                }
            }
            if(count==1)
            {
                sum=sum+lastDigit;//5,5+3=8,8+2=10
            }
            num=num/10;//12345 ,1234 ,123 ,12 ,1
        }
        System.out.println("Sum of Prime digits = "+sum);
    }
}
