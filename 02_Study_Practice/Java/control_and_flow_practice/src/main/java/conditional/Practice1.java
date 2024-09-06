package conditional;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        // if문 문제

        /* 두 수를 입력받아 양수 대소비교 하는 함수를 작성하라. 단, 입력받은 수 중 하나라도 양수가 아닐 경우 무시하는 함수를 만들어라. */

        Practice1 method = new Practice1();
        method.compare();

        // 예)10, 20 입력 시 -> 10과 20 중 큰 값은 20입니다.
    }

    public void compare(){
         Scanner sc = new Scanner(System.in);
        System.out.println("비교하려는 첫 번째 정수를 입력하세요. : ");
        int first = sc.nextInt();
        System.out.println("비교하려는 두 번째 정수를 입력하세요. : ");
        int second = sc.nextInt();

        if(first > 0 && second > 0){
            System.out.println("두 수 중 큰 값은 : " + Math.max(first, second) + "입니다.");
        }
    }
}
