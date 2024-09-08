package sept.first_week;

public class Application3 {

    public static void main(String[] args) {

        // Juhye
        /* 9부터 25까지의 난수를 발생시키고 난수가 짝수일 경우 1부터 난수까지의 홀수번째 수들의 합,
         * 난수가 홀수일 경우 1부터 난수까지의 짝수들의 합을 구하는 함수를 구하시오.
         *
         * 예)
         *  난수 : 10
         *  1부터 10까지의 홀수들의 합 : 25
         *  난수 : 11
         *  1부터 11까지의 짝수들의 합 : 30
         */

    }
    public void sum1ToRandom(){

        int random = (int)(Math.random() * 17) + 9;
        System.out.println("난수 : " + random);
        int sum = 0;

        if(random % 2 == 0){
            for(int i = 1; i <= random; i++){
                if(i % 2 != 0){
                    sum += i;
                }
            }
            System.out.println("1부터 " + random + "까지의 홀수들의 합은 " + sum + "입니다.");
        } else{
            for(int i = 1; i <= random; i++){
                if(i % 2 == 0){
                    sum += i;
                }
            }
            System.out.println("1부터 " + random + "까지의 짝수들의 합은 " + sum + "입니다.");
        }

    }
}
