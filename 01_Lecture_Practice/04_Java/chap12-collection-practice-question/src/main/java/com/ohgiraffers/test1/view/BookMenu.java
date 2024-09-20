package com.ohgiraffers.test1.view;

import com.ohgiraffers.test1.controller.BookManager;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu{

    private Scanner sc;

    private BookManager bm;

    public BookMenu(){}

    public void menu(){
        System.out.println(" *** 도서 관리 프로그램 *** ");

        while(true){
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.println("메뉴 번호 선택 : ");
            int num = sc.nextInt();

            switch(num){
                case 1: bm.addBook(inputBook()); break;
                case 2:
                    System.out.println("정렬 방식을 선택해주세요(1.오름차순, 2.내림차순) : ");
                    int sortNum = sc.nextInt();
                    if(sortNum == 1){
                        bm.sortedBookList(1);
                    } else if(sortNum == 2){
                        bm.sortedBookList(2);
                    } else{
                        System.out.println("번호를 잘못입력하였습니다.");
                }
            }

        }

    }
    }

    public BookDTO inputBook(){
        BookDTO bookDTO = new BookDTO();
        return bookDTO;
    }

    public String inputBookTitle(){
        return "sdfsdf";
    }






}
