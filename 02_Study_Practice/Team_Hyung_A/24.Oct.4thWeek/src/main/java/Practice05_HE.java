import java.util.Scanner;

public class Practice05_HE {

    /* 문제 2
     *      숫자 한개를 입력받아 양수면 " 입력하신 숫자는 양수입니다!" 라고 출력하고,
     *      음수이면 "입력하신 숫자는 음수입니다!" 출력하시오
     *      단, 입력한 숫자가 0이면 "0입니다!" 라고 출력하세요.
     *      조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다~" 라고 출력하시오 */

    public void method5(){

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("입력하신 숫자는 양수입니다.");
        } else if(num < 0) {
            System.out.println("입력하신 숫자는 음수입니다.");
        } else {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        System.out.println("프로그램을 종료합니다.");

    }

}
