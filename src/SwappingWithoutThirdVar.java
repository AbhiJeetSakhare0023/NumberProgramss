public class SwappingWithoutThirdVar {
    public static void main(String[] args) {
        int num1=20;
        int num2=77;
        System.out.println("before Swapping num1 = "+num1);
        System.out.println("before Swapping num2 = "+num2);

        num1=num1+num2; // 50
        num2=num1-num2; // 50-30=20
        num1=num1-num2; // 50-20=30 done

        System.out.println("=============================================");

        System.out.println("after Swapping num1 = "+num1);
        System.out.println("after Swapping num2 = "+num2);

    }
}
