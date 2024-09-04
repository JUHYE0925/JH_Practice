package com.ohgiraffers.level01.basic;

public class Application {

    public static void main(String[] args) {

        com.ohgiraffers.level01.basic.Calculator calc = new com.ohgiraffers.level01.basic.Calculator();
        calc.checkMethod();

        int sum1to10 = calc.sum1to10();
        System.out.println("1부터 10까지의 합은 : " + sum1to10);

        calc.checkMaxNumber(10, 20);

        int sumTwoNumber = calc.sumTwoNumber(10, 20);
        System.out.println("두 수의 합은 : " + sumTwoNumber);

        int minusTwoNumber = calc.minusTwoNumber(10,5);
        System.out.println("두 수의 차는 : " + minusTwoNumber);




    }
}
