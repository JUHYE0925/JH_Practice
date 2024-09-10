package sept.first_week;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        //Eunseo
        /* 사용자가 입력한 수가 실수라면
         * 강제 자료형변환을 통해 정수로 바꾼 뒤
         * 1부터 사용자가 입력한 값을 모두 더한 뒤
         * 만약 그 값이 짝수라면
         * 1부터 사용자가 입력한 수까지의 홀수의 개수에 곱하고
         * 홀수이면 1부터 사용자가 입력한 수까지의 짝수의 개수에 곱하시오
         *
         * 예) 원하시는 수를 입력해주세요 : 10
         *     1부터 10까지의 합에 10의 짝수의 개수와 10을 곱하면 550입니다.
         *
         * */
    }

    public void multiCount() {

        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 수를 입력해주세요 : ");
        double num = sc.nextDouble();
        int num2 = (int) num;

//        int countOddNum = 0;
        int sum = 0;
       for(int i = 1; i <= num2; i++){sum+=i;}
       int countOdd = 0;
       int countEven = 0;
       for(int i = 1; i <= num2; i++){
           if(i % 2 != 0){
               countOdd++;
           } else {
               countEven++;
           }
       }
       if(sum % 2 == 0){
           System.out.println("1부터 " + num2 + "까지의 합에 " + num2 + "의 홀수의 개수 " + countOdd + "의 곱은 " + (sum * countOdd) + "입니다.");
       } else {
           System.out.println("1부터 " + num2 + "까지의 합에 " + num2 + "의 짝수의 개수 " + countEven + "의 곱은 " + (sum * countEven) + "입니다.");
       }

        }


    }

