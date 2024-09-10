package sept.first_week;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        // Juhye
        /* 사용자의 이름과 키와 몸무게를 입력받은 후 BMI를 계산하여 값이 '18 이상 23미만'이면 "정상체중입니다.'를
        *  '23이상 25미만'이면 "비만 전단계입니다."를 출력하고
        *  '25이상 30미만'이면 "1단계 비만입니다."를
        *  '30이상 35미만'이면 "2단계 비만입니다."를
        *  '35이상'이면 "3단계 비만입니다."를 출력하는 함수를 작성하시오.
        *  또한 BMI 점수가 위의 언급한 범위에 속하지 않을 경우 즉, 18점 미만일 경우 "키와 몸무게를 제대로 입력해주세요"가 출력되게 하시오.
        *   단, 키와 몸무게는 실수로 입력받되 BMI지수 계산 값은 정수로 출력되게끔 작성하시오.
        *
        *  BMI 계산법 = 체중(kg)/(신장(m) * 신장(m))
        *
        * 예 ) 당신의 이름을 입력해주세요. : 홍길동
        *      당신의 키를 입력해주세요. : 1.85
        *      당신의 몸무게를 입력해주세요. : 81.5
        *
        *      출력 : 홍길동님의 BMI지수는 23점으로 비만 전단계입니다.
        *  */
    }

    public void countBmi(){

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 이름을 입력해주세요. : ");
        String name = sc.nextLine();
        System.out.println("당신의 키(m)를 입력해주세요. (185cm -> 1.85m) : ");
        double height = sc.nextDouble();
        System.out.println("당신의 몸무게(kg)를 입력해주세요. : ");
        double weight = sc.nextDouble();

        int bmi = (int)(weight/(height*height));

            System.out.print(name + "님의 BMI지수는 " + bmi + "점으로 ");
            if (bmi >= 18 && bmi < 23) {
                System.out.println("정상체중입니다.");
            } else if (bmi >= 23 && bmi < 25) {
                System.out.println("비만 전단계입니다.");
            } else if (bmi >= 25 && bmi < 30) {
                System.out.println("비만 1단계입니다.");
            } else if (bmi >= 30 && bmi < 35) {
                System.out.println("비만 2단계입니다.");
            } else if(bmi > 35) {
                System.out.println("비만 3단계입니다.");
            } else {
                System.out.println("키와 몸무게를 제대로 입력해주세요.");
            }
    }
}
