import java.util.Scanner;

public class Practice9_HS {

    /* 트리를 만드세요. (반복문) →숫자 상관 없이 트리가 나올 수 있게 */

    public void method9(){

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 트리의 높이를 숫자로 입력하세요. : ");
        int row = sc.nextInt();

        for(int i = 1; i < row; i++) {
            for (int j = 1; j < (row-1); j++) {

                for (int x = 1; x < (row*2)-1; x++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

}
