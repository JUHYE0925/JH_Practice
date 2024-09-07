package com.ohgiraffers.section02.looping_and_branching.normal;

public class Application2 {

    public static void main(String[] args) {

        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */

    }

        public void aToZ(){

        System.out.println("============ for문 ===========");
        for(char i = 97; i <= 122; i++){
                System.out.print(i);
            }

        System.out.println();

        System.out.println("============ while문 ===========");
        char j = 97;
        while(j <= 122){
            System.out.print(j);
            j++;
        }
        }

}
