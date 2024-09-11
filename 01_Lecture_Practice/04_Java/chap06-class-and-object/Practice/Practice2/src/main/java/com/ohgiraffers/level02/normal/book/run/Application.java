package com.ohgiraffers.level02.normal.book.run;

import com.ohgiraffers.level02.normal.book.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {

    public static void main(String[] args) {

        BookDTO book1 = new BookDTO();
        book1.printInformation();

        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        book2.printInformation();

        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book3.printInformation();


    }
}
