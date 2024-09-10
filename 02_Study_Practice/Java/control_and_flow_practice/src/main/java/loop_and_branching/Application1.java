package loop_and_branching;

public class Application1 {

    public static void main(String[] args) {
        // Juhye
        /* 1부터 100까지의 난수를 발생시킨 후 1부터 난수까지의 합을 구하는 함수를 작성하시오.
        *
        * 예)
        * 난수 : 10
        *
        * 1부터 10까지의 합은 = 55
        * */

    }

    public void sumRandom(){

        int random = (int)(Math.random() * 101) + 1;
        System.out.println("난수 : " + random);

        System.out.println("============== while문 ==============");
        int i = 1;
        int sum = 0;
        while(i <= random){
            sum += i;
            i++;
        }
        System.out.println("1부터 난수 " + random + "까지의 합은 : " + sum + "입니다.");

        System.out.println("============== for문 ==============");
        int sum2 = 0;
        for(int j = 1; j <= random; j++){
            sum2 +=j;
        }
        System.out.println("1부터 난수 " + random + "까지의 합은 : " + sum2 + "입니다.");



    }

}
