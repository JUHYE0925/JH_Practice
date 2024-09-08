package loop_and_branching;

public class Application2 {

    public static void main(String[] args) {
        // Juhye
        /* 2단부터 9단까지 단 중 짝수번째 단만 출력하시오.
        *  즉, 2단, 4단, 6단, 8단만 출력하시오. (반복문, 제어문, continue문 모두 사용하시오.)
        *
        * 예 )
        * < 2단 >
        * 2 * 1 = 2
        * 2 * 2 = 4
        * 2 * 3 = 6
        * 2 * 4 = 8
        * 2 * 5 = 10
        * 2 * 6 = 12
        * 2 * 7 = 14
        * 2 * 8 = 16
        * 2 * 9 = 18
        */

    }

    public void gugudan(){

        System.out.println("============ for문 ==============");
        for(int i = 2; i <= 9; i++){
            if(i % 2 == 0){
                System.out.println("< " + i +"단 >");
                for(int j = 1; j < 10; j++){
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            } else {
                continue;
            }
            System.out.println();
        }

        System.out.println("============== while문 ==============");
        int i = 2;
        while(i <= 9){
            if(i % 2 == 0){

                System.out.println("< " + i + "단 >");

                int j = 1;
                while(j < 10){
                    System.out.println(i + " * " + j + " = " + (i * j));
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
