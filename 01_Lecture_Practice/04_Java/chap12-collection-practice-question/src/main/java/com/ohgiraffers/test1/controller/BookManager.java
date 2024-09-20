package com.ohgiraffers.test1.controller;

import com.ohgiraffers.test1.model.comparator.AscCategory;
import com.ohgiraffers.test1.model.comparator.DescCategory;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BookManager {
    private ArrayList<BookDTO> bookList;


    public BookManager(){
        ArrayList<BookDTO> bookArrayList = new ArrayList<BookDTO>();
        this.bookList = bookArrayList;
    }

    public void addBook(BookDTO book){
       bookList.add(book);
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public int searchBook(String title){
        // 몰라 알 수가 없어1

        return 0;
    }

    public void printBook(int index){
        bookList.get(index);
    }

    public void displayAll(){
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(i + " : " + bookList.get(i));
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        // 몰라 알 수가 없어2
        if(select == 1){
            // 오름차순
            AscCategory asc = new AscCategory();
            for(int i = 0; i < bookList.size(); i++){
                System.out.println(asc.compare(i));
            }


        } else {
            // 내림차순
//            bookList = new DescCategory<Integer>(bookList);
            for(int i = 0; i < bookList.size(); i++){
                System.out.println(i);
            }

        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book : br){
            System.out.println(book);
        }
    }
}
