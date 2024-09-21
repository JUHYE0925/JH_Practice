package com.ohgiraffers.test1.view;

import com.ohgiraffers.test1.controller.BookManager;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();

    public BookMenu(){}

    public void menu() {
        System.out.println(" *** 도서 관리 프로그램 *** ");

        while (true) {
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.println("메뉴 번호 선택 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.println("정렬 방식을 선택해주세요(1.오름차순, 2.내림차순) : ");
                    int sortNum = sc.nextInt();
                    if (sortNum == 1) {
                       bm.printBookList(bm.sortedBookList(sortNum));
                    } else if (sortNum == 2) {
                        bm.printBookList(bm.sortedBookList(sortNum));
                    } else {
                        System.out.println("번호를 잘못입력하였습니다.");
                    }
                    break;
                case 3:
                    // 아 몰랑
                    sc.nextLine();
                    System.out.println("삭제할 도서 제목을 입력해주세요 : ");
                    String deletBookNum = sc.nextLine();
                    if(bm.searchBook(deletBookNum) == -1){
                        System.out.println("삭제할 글이 존재하지 않음");
                    } else{
                        bm.deleteBook(bm.searchBook(deletBookNum));
                        System.out.println("성공적으로 삭제");
                    }
                    break;
                case 4:
                    // bm.searchBook(inputBookTitle());
                    int search = bm.searchBook(inputBookTitle());
                    if(search == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else{
                        bm.printBook(search);
                    }
                    break;
                case 5:
                    if(false){
                        System.out.println("출력할 도서가 없습니다.");
                    } else {
                        bm.displayAll();
                    }
                    break;
                case 6:
                    return;

            }

        }

    }


    public BookDTO inputBook() {
        BookDTO bookDTO = new BookDTO();
        System.out.println("도서 번호를 입력해주세요 : ");
        bookDTO.setbNO(sc.nextInt());
        sc.nextLine();
        System.out.println("도서 제목을 입력해주세요 : ");
        bookDTO.setTitle(sc.nextLine());
        //sc.nextLine();
        System.out.println("도서 장르를 입력해주세요(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        bookDTO.setCategory(sc.nextInt());
        sc.nextLine();
        System.out.println("도서 저자를 입력해주세요 : ");
        bookDTO.setAuthor(sc.nextLine());

        return bookDTO;
    }

    public String inputBookTitle() {
        sc.nextLine();
        System.out.println("도서 제목을 입력하세요 : ");
        String bookTitle = sc.nextLine();
        return bookTitle;
    }

}





