public class practice3 {

    public static void main(String[] args) {

        /* 연산자를 이용하여 5와 3라는 숫자로 값이 6이 나올수 있도록 구하시오 */
        
        int num1 = 5;
        int num2 = 3;
        
        int sum = ++num1 + num2 - num2;
        System.out.println("두 변수의 합은 : " + sum);

        int num3 = 5;

        int sum2 = ++num3;
        System.out.println("sum2 = " + sum2);
        
        int sum3 = num2 * 2;
        System.out.println("sum3 = " + sum3);
        
        
    }
}
