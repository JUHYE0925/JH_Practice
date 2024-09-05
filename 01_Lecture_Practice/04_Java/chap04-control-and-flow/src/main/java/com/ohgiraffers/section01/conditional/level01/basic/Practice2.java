package com.ohgiraffers.section01.conditional.level01.basic;

import com.ohgiraffers.section01.conditional.level03.hard.Practice1;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        /* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
         * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */

        Practice2 method = new Practice2();
        method.evenOrOdd();


    }

    public void evenOrOdd(){

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력해주세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else {
            System.out.println("입력하신 숫자는 홀수입니다.");
        }

    }

}
