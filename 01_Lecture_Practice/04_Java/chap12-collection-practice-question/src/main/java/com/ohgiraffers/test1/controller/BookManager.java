package com.ohgiraffers.test1.controller;

import com.ohgiraffers.test1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Stack;

public class BookManager {

    public BookManager(){}

    ArrayList<BookDTO> bookArrayList = new ArrayList<>();

    public void addBook(BookDTO book){
        bookArrayList.add(book);
    }

    public void deleteBook(int index){

    }

    public int searchBook(String title){
        return 0;
    }

    public void displayAll(){

    }

//    public ArrayList<BookDTO> sortedBookList(int selected){
//        return
//    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book : br){
            System.out.println(book);
        }
    }
}
