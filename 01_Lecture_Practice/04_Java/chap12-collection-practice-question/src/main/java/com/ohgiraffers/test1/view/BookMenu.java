package com.ohgiraffers.test1.view;

import com.ohgiraffers.test1.controller.BookManager;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();

    // 기본생성자
    public BookMenu(){}

    // 도서관리 프로그램에 해당하는 메인 메뉴 출력,
    // 각 메뉴에 해당하는 BookManager 클래스의 메소드 실행
    // → 반복 출력되게 한다
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
                    // addBook(inputBook()이 리턴한 객체) 실행
                    bm.addBook(inputBook());
                    break;
                case 2:
                    // sortedBookList(정렬종류번호) 실행
                    // =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
                    // 정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
                    // 1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
                    // => ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행
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
                    // ***********************
                    //  deleteBook (도서 번호) 실행
                    //  => seachBook()메소드를 이용
                    //  => 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
                    //  1일 경우 “삭제할 글이 존재하지 않음”
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
                    // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
                    // => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
                    // -1이 아닐 경우 printBook(index) 출력

                    int search = bm.searchBook(inputBookTitle());
                    if(search == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else{
                        bm.printBook(search);
                    }
                    break;
                case 5:
                    // displayAll() 실행
                    // => 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
                    // 아닌 경우는 전체 출력
                    if(false){
                        System.out.println("출력할 도서가 없습니다.");
                    } else {
                        bm.displayAll();
                    }
                    break;
                case 6:
                    // main()으로 리턴
                    return;

                    // 메뉴 번호 선택 :  >> 입력 받음
                    // 메뉴 화면 반복 실행 처리
                    // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
            }
        }
    }


    public BookDTO inputBook() {
        // BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴

        // 도서 번호 : >> 임의 값 입
        // "도서 제목 : " >> 입력 받음
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        // "도서 저자 : " >> 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴

        BookDTO bookDTO = new BookDTO();
        System.out.println("도서 번호를 입력해주세요 : ");
        bookDTO.setbNO(sc.nextInt());

        sc.nextLine();
        System.out.println("도서 제목을 입력해주세요 : ");
        bookDTO.setTitle(sc.nextLine());

        System.out.println("도서 장르를 입력해주세요(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        int bookCategory = sc.nextInt();
        if(bookCategory >= 1 && bookCategory <= 4){
            bookDTO.setCategory(bookCategory);
        }
//        else{
//            System.out.println("1번과 4번 중에서 골라주세요.");
//        }

        sc.nextLine();
        System.out.println("도서 저자를 입력해주세요 : ");
        bookDTO.setAuthor(sc.nextLine());

        return bookDTO;
    }

    public String inputBookTitle() {
        // 검색할 도서제목을 키보드로 입력 받아 리턴

        // “도서 제목 : “ >> 입력 받음 >> 리턴

        sc.nextLine();
        System.out.println("도서 제목을 입력하세요 : ");
        String bookTitle = sc.nextLine();
        return bookTitle;
    }

    // * 위와 같이 추가, 삭제, 검색에 필요한 정보는 키보드로 입력 받도록 각각의 메소드 따로 구현
}





