import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        /*문제 1. 고양이와 강아지 중 한가지 선택지를 고르게 한다음
         * cat을 입력하면 "애옹"을, 아니면 "므엉"을 출력하시오*/

        Practice4 method = new Practice4();
        method.pet();

    }

    public void pet(){

        Scanner sc = new Scanner(System.in);
        System.out.println("cat과 dog 중 한 가지만 선택 후입력하시오. : ");
        String selectedPet = sc.nextLine();

        if(selectedPet.equals("cat")){
            System.out.println("애옹");
        } else {
            System.out.println("므엉");
        }
    }
}
