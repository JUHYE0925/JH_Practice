package conditional;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        // if-else문 문제
        /* 아이디를 입력받은 후 해당 아이디가 영문자(대소문자 모두 포함)로 시작할 경우 "사용 가능한 아이디 입니다."라는 문구가 출력되게 하시오.
        * 만약 아이디가 영문자로 시작하지 않을 경우 "영문자로 작성해주세요."라는 문제가 출력되게 하시오.*/

        Practice2 method = new Practice2();
        method.login();

        // 예) sdf -> 사용 가능한 아이디 입니다.
        // 예) 12sdf -> 영문자로 작성해주세요.


    }

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 아이디를 입력해주세요 : ");
        int id = sc.nextLine().charAt(0);

        if((id >= 65 && 90>=id) || (id>=97 && 122>=id)){
            System.out.println("사용 가능한 아이디입니다.");
        } else {
            System.out.println("영문자로 작성해주세요.");
        }

    }


}
