package conditional;

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {

        /*문제 3.
         * 유치원 아이들의 이름과 나이를 입력하면 반이름이 출력 되게한다
         * 이때 아이들의 나이는 3살부터 7살까지이고 다른 값을 입력하면 "해당하는 반을 찾을 수 없습니다"를 출력
         *
         * 3살 : 노랑반
         * 4살 : 초록반
         * 5살 : 파랑반
         * 6살 : 분홍반
         * 7살 : 주황반
         *
         * 예) 은서의 나이는 6살이고 분홍반입니다.
         * */

        Practice6 method = new Practice6();
        method.grade();

    }

    public void grade(){

        Scanner sc = new Scanner(System.in);
        System.out.println("아이의 이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.println("아이의 나이를 입력하세요. : ");
        int age = sc.nextInt();
        String className = "";

        if(age >= 3 && age <= 7){
            switch(age){
                case 3 :
                    className = "노랑반";
                    break;
                case 4 :
                    className = "초록반";
                    break;
                case 5 :
                    className = "파랑반";
                    break;
                case 6 :
                    className = "분홍반";
                    break;
                case 7 :
                    className = "주황반";
                    break;
            }
            System.out.println(name + "의 나이는 " + age + "살 이고, " + className + " 입니다.");
        } else{
            System.out.println("해당하는 반을 찾을 수가 없습니다.");
        }
    }
}
