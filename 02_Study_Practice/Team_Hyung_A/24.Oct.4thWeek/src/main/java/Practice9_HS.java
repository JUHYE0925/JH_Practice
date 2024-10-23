import java.util.Scanner;

public class Practice9_HS {

    /* 트리를 만드세요. (반복문) →숫자 상관 없이 트리가 나올 수 있게 */

    public void method9(){

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 트리의 높이를 숫자로 입력하세요. : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("ദ്ദി◍•ᴗ•◍)" + " 와아아~~ 트리 완성!!!!!!");


    }

}
