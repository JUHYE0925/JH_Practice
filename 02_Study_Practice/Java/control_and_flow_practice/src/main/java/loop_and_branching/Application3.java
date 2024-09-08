package loop_and_branching;

public class Application3 {

    public static void main(String[] args) {
        //Eunseo
        /* 문제 1. for문을 이용하여 1부터 10까지 11을 만들 수 있는 모둔 조합과 결과를 출력하시오
         * 예 ) 1 + 10 = 11
         *      2 + 9 = 11
         *      3 + 8 = 11
         *      4 + 7 = 11
         *      5 + 6 = 11
         *      6 + 5 = 11
         *      7 + 4 = 11
         *      8 + 3 = 11
         *      9 + 2 = 11
         *      10 + 1 = 11
         * */
    }

    public void make11(){

        int eleven = 11;
        System.out.println("============= for문 ============");
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " + " +  (eleven - i) + " = " + eleven);
        }

        System.out.println("============= while문 ============");
        int j = 1;
        while(j < 11){
            System.out.println(j + " + " +  (eleven - j) + " = " + eleven);
            j++;
        }
    }
}
