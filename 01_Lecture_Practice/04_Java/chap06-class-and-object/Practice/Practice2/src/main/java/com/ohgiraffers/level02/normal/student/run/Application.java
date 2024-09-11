package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO student = new StudentDTO();

        Scanner sc = new Scanner(System.in);
        System.out.println("학년을 입력해주세요 : ");
        int grade = sc.nextInt();
        System.out.println("반을 입력해주세요 : ");
        int classNum = sc.nextInt();
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.println("키를 입력해주세요 : ");
        double height = sc.nextDouble();
        System.out.println("성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);

        student.setGrade(grade);
        student.setClassroom(classNum);
        student.setName(name);
        student.setHeight(height);
        student.setGender(gender);

        student.printInformation();


    }
}
