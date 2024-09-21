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
        for(int i = 0; i < bookList.size(); i++){
//            System.out.println(bookList.get(i));
            if(title.equals(bookList.get(i).getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index){
        // 인덱스에 해당하는 객체 출력
        System.out.println(bookList.get(index));
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
            bookList.sort(new AscCategory());
            for(BookDTO ascBook : bookList){
                System.out.println(ascBook);
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

            bookList.sort(new DescCategory());
            for(BookDTO descBook : bookList){
                System.out.println(descBook);
            }
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book : br){
            System.out.println(book.toString());
        }
    }
}
