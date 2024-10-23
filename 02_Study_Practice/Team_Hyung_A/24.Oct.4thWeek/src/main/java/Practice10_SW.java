public class Practice10_SW {

    /* int[] numbers = {5, 12, 7, 4, 15, 20, 9, 18, 25, 30};
    정수 배열을 초기화 한 후 3의 배수와 5의 배수의 개수를 출력하시오 */

    public void method10(){

        int[] numbers = new int[] {5, 12, 7, 4, 15, 20, 9, 18, 25, 30};

        int multiple3Count = 0;
        int multiple5Count = 0;


        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0 && numbers[i] % 5 != 0){
                multiple3Count++;
            } else if(numbers[i] % 3 != 0 && numbers[i] % 5 == 0){
                multiple5Count++;
            } else if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                multiple3Count++;
                multiple5Count++;
            } else {
                continue;
            }
        }

        System.out.println("3의 배수의 갯수 = " + multiple3Count);

        System.out.println("5의 배수의 갯수 = " + multiple5Count);
    }

}
