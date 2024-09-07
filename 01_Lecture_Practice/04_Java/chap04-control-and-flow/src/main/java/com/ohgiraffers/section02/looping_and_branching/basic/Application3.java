package com.ohgiraffers.section02.looping_and_branching.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */
    }

    public void sumEvenNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        System.out.println("============ for문 ============");
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0){
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println("1부터 입력받은 " + num + "까지 짝수의 합은 " + sum + "입니다.");

        // 아래와 같이 잘못 작성했을 때도 원하는 값을 출력함. 왜 그런지 아직 이유를 모름
//        for (int i = 1; i <= num; i++) {
//
//            if (num % 2 == 0) ;
//            {
//                i++;
//            }
//            sum += i;
//        }

        System.out.println("============ while문 ============");

        int sum2 = 0;

        int j = 1;
        while (j <= num) {
            if (j % 2 == 0){
                sum2 += j;
//            } else {
//                continue;
//            }
            }
            j++;
        }
        System.out.println("1부터 입력받은 " + num + "까지 짝수의 합은 " + sum2 + "입니다.");
    }
}
