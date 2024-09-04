public class practice1 {

    public static void main(String[] args) {

        /* 1. 변수에 3이란 값을 대입한 후 36이란 값이 출력되는 연산식을 작성하시오. */
        
        int num1 = 3;
        int num2 = num1 *= 12;

        System.out.println("num2 = " + num2);

        /* 2. 증감연산자를 사용하여 3을 대입한 변수가 16가 되게끔 연산식을 작성하시오 */
        
        
        int num3 = 3;
        int result1 = ++num3 * 4;
        System.out.println("result1 = " + result1);

        /* 3. 변수의 값이 대/소문자와 영문자인지를 구분하는 식을 작성하시오.
        *
        * 예) c는 소문자입니다.
        *     X는 대문자입니다.
        *     ㄹ는 영문자가 아닙니다.
        */

        char num4 = 'c';
        char num5 = 'X';
        char num6 = 'ㄹ';
//        int num5 = ;
        String result2 = (num4 >= 97 && num4 <= 122)? num4 + "의 값은 소문자입니다." : (num4 >= 65 && num4 <= 90)? num4 + "의 값은 대문자입니다." : "영문자가 아닙니다.";
        System.out.println("result2 = " + result2);

        String result3 = (num5 >= 97 && num5 <= 122)? num5 + "의 값은 소문자입니다." : (num5 >= 65 && num5 <= 90)? num5 + "의 값은 대문자입니다." : "영문자가 아닙니다.";
        System.out.println("result3 = " + result3);

        String result4 = (num6 >= 97 && num6 <= 122)? num6 + "의 값은 소문자입니다." : (num6 >= 65 && num6 <= 90)? num6 + "의 값은 대문자입니다." : "영문자가 아닙니다.";
        System.out.println("result4 = " + result4);

    }
}
