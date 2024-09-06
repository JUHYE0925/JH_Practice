package conditional;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {

        /*문제 2. 사용자의 키를 입력 받은 후
         * 사용자의 키가 150cm 이상 160cm 미만 이면 "평균에 비해 키가 작습니다",
         * 160cm 이상 170cm 미만이면 "평균 키 입니다",
         * 170 이상 200 미만이면 "평균에 비해 키가 큽니다"를 출력하시오.
         * 또한 사용자가 입력한 키를 반환하는 출력문을 만드시오.
         *
         * 예)
         * 키를 입력 하세요 : 160
         * 출력 : "당신의 키는 160 cm 이고 평균 키 입니다
         *
         * */

        Practice5 method = new Practice5();
        method.height();

    }
    public void height(){

        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요 : ");
        double myHeight = sc.nextDouble();

        System.out.print("당신의 키는 " + myHeight + "cm 이고 ");

        if(myHeight >= 150 && myHeight < 160){
            System.out.print("평균에 비해 키가 작습니다.");
        } else if(myHeight >= 160 && myHeight < 170){
            System.out.println("평균 키입니다.");
        } else if(myHeight >= 170 && myHeight < 200){
            System.out.println("평균에 비해 키가 큽니다.");
        }
    }
}
