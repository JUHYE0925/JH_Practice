package loop_and_branching;

public class Application5 {

    public static void main(String[] args) {

        // Haeun
        /* 1부터 100까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 100까지의 합 : 5050
         * */
    }
    public void sum1To100(){


        System.out.println("============ for문 ============");
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("1부터 100까지의 합 : " + sum);

        System.out.println("============ while문 ============");
        int j = 1;
        int sum2 = 0;
        while(j <= 100){
            sum2 += j;
            j++;
        }
            System.out.println("1부터 100까지의 합 : " + sum2);
    }
}
