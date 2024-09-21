package com.ohgiraffers.test1.model.dto;

public class BookDTO {

    private int bNo;       // 도서 번호
    private int category;  // 도서분류코드
    private String title;  // 도서 제목
    private String author;  // 도서 저자

    public BookDTO(){}
    public BookDTO(int category, String title, String author){
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setbNO(int bNo){
        this.bNo = bNo;
    }

    public void setCategory(int category){
        this.category = category;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getbNo(){
        return bNo;
    }

    public int getCategory(){
        return category;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString() {
        return  "도서 번호 : " + this.bNo +
                ", 도서 제목 : " + this.title +
                ", 도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " + this.category +
//                ", title='" + title + '\'' +
                ", 도서 저자 : '" + this.author + '\'';
    }
}
