import java.util.Scanner;

public class Practice1_JH {

    public static void main(String[] args) {

        /* 1부터 100까지 중 3의 배수이거나 7의 배수인 값을 출력하시오.
        *  또한 출력된 배수들의 갯수도 구하시오. */

        Practice1_JH practice1 = new Practice1_JH();
        practice1.method1();


    }

    public void method1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요. : ");
        int num = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= num; i++) {

            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
                count++;
            } else{
                continue;
            }
        }
        System.out.println("1부터 " + num + "까지의 3 혹은 7의 배수의 개수는 " + count + "개 입니다.");

    }


}