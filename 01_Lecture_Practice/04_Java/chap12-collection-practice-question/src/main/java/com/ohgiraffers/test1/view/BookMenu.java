package com.ohgiraffers.test1.view;

import com.ohgiraffers.test1.controller.BookManager;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu{

    private Scanner sc;

    private BookManager bm;

    public BookMenu(){}

    public void menu(){}

    public BookDTO inputBook(){
        System.out.println("도서 번호를 입력하세요 : ");
        int bookNum = sc.nextInt();

    }

    public String inputBookTitle(){
        return "sdfsdf";
    }






}
