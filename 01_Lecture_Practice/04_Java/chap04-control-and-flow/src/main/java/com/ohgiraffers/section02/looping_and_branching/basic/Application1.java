package com.ohgiraffers.section02.looping_and_branching.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 1부터 10까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */
    }

        public void sum(){

            System.out.println("============ for문 ============");
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
            System.out.println("1부터 10까지의 합 : " + sum);


            System.out.println("============ while문 ===========");

        int i = 1;
        int sum2 = 0;
        while(i <= 10){
            sum2 += i;
            i++;
        }
            System.out.println("1부터 10까지의 합 : " + sum2);
        }



}
