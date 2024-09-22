package com.ohgiraffers.test1.model.comparator;

import com.ohgiraffers.test1.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
// java.util.Comparator 인터페이스를 상속받은 정렬용 클래스들 작성함

    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        // 카테고리순 내림차순 정렬 처리
        int result = 0;


        if(o1.getCategory() > o2.getCategory()){

            result = -1;

        } else if(o1.getCategory() < o2.getCategory()){

            result = 1;

        } else{

            result = 0;
        }

        return result;
    }
}
