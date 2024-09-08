package sept.first_week;

public class Application2 {

    public static void main(String[] args) {
        // Juhye
        /* 두 정수를 입력받고 입력받은 두 정수를 매개변수로 받는 함수를 작성하시오.
        *  또한 두 정수가 같으면 두 수를 곱하고, 두 정수가 다르면 더하는 값을 리턴값으로 갖는 함수를 작성하시고
        *  static함수로 작성하여 호출하시오.
        *
        *
        * 예 ) 첫 번째 정수를 입력하세요 : 10
        *      두 번째 정수를 입력하세요 : 10
        *
        * 출력 : 두 수의 곱은 : 100
        * */
    }

    public static String sumTwoNum(int first, int second){

//        if(first == second){
//            return ("두 정수의 곱은 : " + (first * second));
//        } else {
//            System.out.println("두 정수의 합은 : " + (first + second));
//            return ("두 정수의 합은 : " + (first + second));
//        }
        return (first == second)? "두 수의 곱은 : " + (first * second) : "두 수의 합은 : " + (first + second);
    }
}
