public class Practice11_SW {

    /*  int[] numbers = {5, 12, 7, 4, 3, 20, 15, 8, 2, 9};
        정수 배열 초기화 후 짝수의 합과, 홀수의 합을 구해 출력하시오 */

    public void method11(){

        int[] numbers = new int[] {5, 12, 7, 4, 3, 20, 15, 8, 2, 9};

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }

        System.out.println("짝수의 합 = " + sumEven);  // 46
        System.out.println("홀수의 합 = " + sumOdd);  // 39

    }

}
