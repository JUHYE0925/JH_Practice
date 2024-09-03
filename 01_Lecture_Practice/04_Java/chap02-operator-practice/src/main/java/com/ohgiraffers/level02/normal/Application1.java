package com.ohgiraffers.level02.normal;

public class Application1 {

    public static void main(String[] args) {

        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         *
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */

        double score1 = 85.0;
        int score2 = (int)score1;
        String grade = (score2 >= 90)? "A" : (score2 >= 80)? "B" : (score2 >= 70)? "C" : (score2 >= 60)? "D" : "F";
        System.out.println("홍길동의 이번 점수 등급은 " + grade + "입니다.");



    }
}
