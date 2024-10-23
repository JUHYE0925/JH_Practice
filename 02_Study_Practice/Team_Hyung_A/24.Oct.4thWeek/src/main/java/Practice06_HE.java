import java.util.Scanner;

public class Practice06_HE {

    /* 문제 3
     *      숫자 한개를 입력 받아 아래의 조건과 같이 출력하세요.
     *      1) 3의 배수이면서 4의 배수도 해당 => 입력하신 []은(는) 3의 배수이면서 4의 배수입니다.
     *      2) 3의 배수만 해당 => 입력하신 []은(는) 3의 배수입니다.
     *      3) 4의 배수만 해당 => 입력하신 []은(는) 4의 배수입니다.\
     *      4) 3의 배수,4의 배수 해당 안됨 => 입력하신 []은(는) 3의 배수도 4의 배수도 아닙니다.
     *      5) 0을 입력시 => 입력하신 숫자는 0입니다 다른 숫자를 입력해주세요! */

    public void method6(){

        while(true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 한 개를 입력해주세요 : ");
            int num = sc.nextInt();

            if(num != 0) {
                if (num % 3 == 0 && num % 4 == 0) {
                    System.out.println("입력하신 " + num + "은(는) 3의 배수이면서 4의 배수입니다.");
                } else if (num % 3 == 0 && num % 4 != 0) {
                    System.out.println("입력하신 " + num + "은(는) 3의 배수입니다.");
                } else if (num % 3 != 0 && num % 4 == 0) {
                    System.out.println("입력하신 " + num + "은(는) 4의 배수입니다.");
                } else if (num % 3 != 0 && num % 4 != 0) {
                    System.out.println("입력하신 " + num + "은(는) 3의 배수도 4의 배수도 아닙니다.");
                }
            }else if (num == 0) {
                System.out.println("입력하신 숫자는 0입니다. 다른 숫자를 입력해주세요.");
                break;
            }
        }

    }

}
