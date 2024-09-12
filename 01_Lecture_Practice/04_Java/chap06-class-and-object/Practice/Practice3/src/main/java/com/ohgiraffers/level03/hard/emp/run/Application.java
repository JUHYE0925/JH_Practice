package com.ohgiraffers.level03.hard.emp.run;

import com.ohgiraffers.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("번호를 입력하세요 : ");
        int number = sc.nextInt();
        System.out.println("이름을 입력하세요 :");
        String name = sc.next();
        System.out.println("부서를 입력해주세요 : ");
        String dept = sc.next();
        System.out.println("직책을 입력해주세요 : ");
        String job = sc.next();
        System.out.println("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);
        System.out.println("월급을 입력하여주세요 : ");
        int salary = sc.nextInt();
        System.out.println("보너스률을 입력해주세요 : ");
        double bonusPoint = sc.nextDouble();
        System.out.println("핸드폰 번호를 입력해주세요 : ");
        String phone = sc.next();

        String str = sc.nextLine();

        System.out.println("주소를 입력해주세요 : ");
        String address = sc.nextLine();



        EmployeeDTO worker = new EmployeeDTO();

        worker.setNumber(number);
        worker.setName(name);
        worker.setDept(dept);
        worker.setJob(job);
        worker.setAge(age);
        worker.setGender(gender);
        worker.setSalary(salary);
        worker.setBonusPoint(bonusPoint);
        worker.setPhone(phone);
        worker.setAddress(address);

        System.out.println(worker.getNumber());
        System.out.println(worker.getName());
        System.out.println(worker.getDept());
        System.out.println(worker.getJob());
        System.out.println(worker.getAge());
        System.out.println(worker.getGender());
        System.out.println(worker.getSalary());
        System.out.println(worker.getBonusPoint());
        System.out.println(worker.getPhone());
        System.out.println(worker.getAddress());





    }
}
