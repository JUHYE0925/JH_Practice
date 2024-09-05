package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        /* 과일 이름("apple", "banana", "melon", "grape") 중 한 가지를 문자열로 입력하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
         *
         * -- 상품 가격 --
         * apple :  1000원
         * banana : 3000원
         * melon : 2000원
         * grape : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : banana
         *
         * -- 출력 예시 --
         * banana의 가격은 3000원 입니다.
         * */

        Practice2 method = new Practice2();
        method.fruitShop();



    }

    public void fruitShop(){

        Scanner sc = new Scanner(System.in);
        System.out.println("======================= Fruit Shop =======================");
        System.out.println("                    ---- 상품 가격 ----                     ");
        System.out.println("                      apple  :  1000원                     ");
        System.out.println("                      banana :  3000원                     ");
        System.out.println("                      melon  :  2000원                     ");
        System.out.println("                      grape  :  5000원                     ");
        System.out.println("                     -----------------                     ");
        System.out.println("===========================================================");

        System.out.print("원하시는 과일을 골라 입력해주세요 : ");
        String fruit = sc.nextLine();
        String order = "";
        int price = 0;

        if(fruit.equals("apple") || fruit.equals("banana") || fruit.equals("melon") || fruit.equals("grape")){
            if(fruit.equals("apple")){
                order = "apple";
                price = 1000;
            } else if(fruit.equals("banana")){
                order = "banana";
                price = 3000;
            } else if(fruit.equals("melon")){
                order = "melon";
                price = 2000;
            } else if(fruit.equals("grape")){
                order = "grape";
                price = 5000;
            }

            System.out.println(order + "의 가격은 " + price + "원 입니다.");

        } else {
            System.out.println("준비된 상품이 없습니다.");
        }
    }

}
