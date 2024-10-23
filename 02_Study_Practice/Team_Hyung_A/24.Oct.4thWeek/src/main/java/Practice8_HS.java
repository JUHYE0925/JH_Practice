import java.util.Scanner;

public class Practice8_HS {

    /*아래와 같이 나오도록 하세요. (반복문)*/

    public void method8(){

        Scanner sc = new Scanner(System.in);
        System.out.println("영문자 한 단어를 입력해주세요 : ");
        String word = sc.nextLine();

        // System.out.println(word.charAt(1));

        for(int i = 0; i < word.length(); i++) {

            for(int j = 0; j < i; j++){
                System.out.print(word.charAt(j));
            }

            System.out.println(word.charAt(i));
        }
    }
}
