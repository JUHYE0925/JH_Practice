package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("checkMethod() 호출됨...");
    }

    public int sum1to10(){
//        return 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        int sum = 0;
        for(int i = 1; i <= 10; i++){
        sum += i;
        };
        return sum;
    }

    public void checkMaxNumber(int a, int b){

        int maxNumber = (a <= b)? b : a;
        System.out.println("두 수 중 큰 값은 : " + maxNumber + "이다.");
    }

    public int sumTwoNumber(int a, int b){

        return a + b;
    }

    public int minusTwoNumber(int a, int b){

        return a - b;
    }
}
