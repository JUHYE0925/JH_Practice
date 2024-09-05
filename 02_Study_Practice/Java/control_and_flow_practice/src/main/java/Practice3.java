import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        // if-else-if문 문제

        /* 생일을 입력하면 별자리를 알려주는 프로그램을 만들어보시오. */

        Practice3 method = new Practice3();
        method.constellation();

        /*
        * 물병자리 1월20일 - 2월18일
          물고기자리 2월19일 - 3월20일
          양자리 3월21일 - 4월19일
          황소자리 4월20일 - 5월20일
          쌍둥이자리 5월21일 - 6월21일
          게자리 6월22일 - 7월22일
          사자자리 7월23일 - 8월22일
          처녀자리 8월23일 - 9월23일
          천칭자리 9월 24일 - 10월 22일
          전갈자리 10월 23 - 11월 22일
          사수자리 11월 23일 - 12월 24일
          염소자리 12월 25일 - 1월 19일
        * */

        // 예) 925 -> 당신의 별자리는 천칭자리입니다.


    }

    public void constellation(){

        Scanner sc = new Scanner(System.in);
        System.out.println("생일을 입력해주세요. (예. 9월 25일 -> 925 / 12월 3일 -> 1203): ");
        int birth = sc.nextInt();

        if(birth >= 120 && birth <= 218){
            System.out.println("당신의 별자리는 물병자리 입니다.");
        } else if(birth >= 219 && birth <=320){
            System.out.println("당신의 별자리는 물고기자리 입니다.");
        } else if(birth >= 321 && birth <= 419){
            System.out.println("당신의 별자리는 양자리입니다.");
        } else if(birth >= 420 && birth <= 520){
            System.out.println("당신의 별자리는 황소자리입니다.");
        } else if(birth >= 521 && birth <= 621){
            System.out.println("당신의 별자리는 쌍둥이자리입니다.");
        } else if(birth >= 622 && birth <= 722){
            System.out.println("당신의 별자리는 게자리입니다.");
        } else if(birth >= 723 && birth <= 822){
            System.out.println("당신의 별자리는 사자자리입니다.");
        } else if(birth >= 823 && birth <= 923){
            System.out.println("당신의 별자리는 처녀자리입니다.");
        } else if(birth >= 924 && birth <= 1022){
            System.out.println("당신의 별자리는 천칭자리입니다.");
        } else if(birth >= 1023 && birth <= 1122){
            System.out.println("당신의 별자리는 전갈자리입니다.");
        } else if(birth >= 1123 && birth <= 1224){
            System.out.println("당신의 별자리는 사수자리입니다.");
        } else if((birth >= 1225 && birth <= 1231) || (birth >= 101 && birth <= 119 )){
            System.out.println("당신의 별자리는 염소자리입니다.");
        } else {
            System.out.println("제대로된 생일을 입력해주세요.");
        }

    }
}
