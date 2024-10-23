import java.util.Scanner;

public class Practice04_HE {

    /* 문제 4
     *      숫자 한개를 입력받아 그 수가 짝수면 "입력하신 숫자는 짝수입니다!" 라고 출력하고,
     *      짝수가 아니면 출력하지 않는 구문을 작성하시오
     *      단, 조건과 상관 없이 종료될 때 "프로그램을 종료합니다~" 라고 출력하시오 */

    public void method4(){

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
