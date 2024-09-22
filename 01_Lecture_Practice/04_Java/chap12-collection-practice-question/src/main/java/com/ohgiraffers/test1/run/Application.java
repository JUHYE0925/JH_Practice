package com.ohgiraffers.test1.run;

import com.ohgiraffers.test1.view.BookMenu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // BookMenu 클래스 객체 생성하고 menu() 메소드 실행

        BookMenu bookMenu = new BookMenu();
        bookMenu.menu();
    }
}
