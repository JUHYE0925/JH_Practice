package loop_and_branching;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        //Eunseo
        /*문제 2. 1부터 사용자가 입력한 정수까지의 홀수의 개수를 구하시오
         * 예 ) 정수를 하나 입력하세요 :
         * 1부터 10까지의 홀수의 개수는 5개입니다
         * */
    }

    public void countOddNum(){


        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        System.out.println("================= for문 ================");
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        System.out.println("1부터 " + num + "까지의 홀수의 개수는 " + count + "개 입니다.");

        System.out.println("================= while문 ================");
        int count2 = 0;
        int j = 1;
        while( j <= num){
            if(j % 2 != 0) {
                count2++;
            }
            j++;
        }
        System.out.println("1부터 " + num + "까지의 홀수의 개수는 " + count2 + "개 입니다.");
        }



    }

