package com.ohgiraffers.test1.controller;

import com.ohgiraffers.test1.model.comparator.AscCategory;
import com.ohgiraffers.test1.model.comparator.DescCategory;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BookManager {

    private ArrayList<BookDTO> bookList;


    public BookManager(){
        // 기본 생성자
        // ArrayList<BookDTO> = bookList 인스턴스 생성
        ArrayList<BookDTO> bookArrayList = new ArrayList<BookDTO>();
        this.bookList = bookArrayList;
    }

    public void addBook(BookDTO book){
        // 전달받은 BookDTO객체를 생성자시 선언한 ArrayList객체에 추가
        //bookList에 도서 추가
        bookList.add(book);
    }

    public void deleteBook(int index){
        // 전달받은 도서 번호로 ArryaList 안에 있는 정보 삭제
        //전달받은 index로 삭제
        bookList.remove(index);
    }

    public int searchBook(String title){
        // 전달받은 도서 제목으로 도서를 검색하고 결과값 반환
        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        // 도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴

        for(int i = 0; i < bookList.size(); i++){
//            System.out.println(bookList.get(i));
            if(title.equals(bookList.get(i).getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index){
        // 전달받은 인덱스에 있는 도서정보 출력
        // 인덱스에 해당하는 객체 출력
        System.out.println(bookList.get(index));
    }

    public void displayAll(){
        // 도서목록 전체 출력
        // 도서 전체 리스트를  출력
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(i + " = [ " + bookList.get(i) + " ]");
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        // 몰라 알 수가 없어2

        // 전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서
        // ArrayList<BookDTO>에 담아서 리턴

        // 전달받은 매개변수의 값에 따라 정렬(1. 오름차순,2. 내림차순)
        // for문을 이용하여 ArrayList<BookDTO> 에 추가
        // 해당 배열 주소 값 리턴

        if (select == 1) {
            // 오름차순
            // 작은 값부터 정렬하는 방법 by 형부
//            for(int i=0; i<bookList.size(); i++){
//                for(int j = i+1; j<bookList.size(); j++){
//                    if(asc.compare(bookList.get(i), bookList.get(j)) == 1){
//                        BookDTO tmpDTO = bookList.get(i);
//                        bookList.set(i, bookList.get(j));
//                        bookList.set(j, tmpDTO);
//                    }
//                }
//            }
            // 반복문을 통해 요소들을 순회하면서 수정(추가, 삭제)하는 코드를 작성하면 ConcurrentModificationException 발생
//            bookList.sort(new AscCategory());
//            for(BookDTO ascBook : bookList){
//                bookList.add(ascBook);
//            }

            bookList.sort(new AscCategory());
            for (BookDTO ascBook : bookList) {
                if (bookList.contains(bookList)) {
                    bookList.add(ascBook);
                }
            }
        } else {
            // 내림차순

            // 큰 값부터 정렬하는 방법 by 형부
//            for(int i=0; i<bookList.size(); i++){
//                for(int j = i+1; j<bookList.size(); j++){
//                    if(asc.compare(bookList.get(i), bookList.get(j)) == -1){
//                        BookDTO tmpDTO = bookList.get(i);
//                        bookList.set(i, bookList.get(j));
//                        bookList.set(j, tmpDTO);
//                    }
//                }
//            }
            // 반복문을 통해 요소들을 순회하면서 수정(추가, 삭제)하는 코드를 작성하면 ConcurrentModificationException 발생
//            bookList.sort(new DescCategory());
//            for(BookDTO descBook : bookList){
//                bookList.add(descBook);
//            }
            bookList.sort(new DescCategory());
            for (BookDTO descBook : bookList) {
                if (bookList.contains(bookList)) {
                    bookList.add(descBook);
                }
            }
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        // 전달 받은 ArrayList<BookDTO>를 향상된 for문을 이용하여 출력
        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
        for(BookDTO book : br){
            System.out.println(book.toString());
        }
    }
}
