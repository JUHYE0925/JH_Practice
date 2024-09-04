public class practice1 {

    public static void main(String[] args) {

        /* 음식의 가격을 정수형 변수로 선언하고, 음식의 무게를 실수형 변수로 선언하시오.
        * 그 후 음식의 무게를 정수형 변수로 형변환 시킨 후 음식의 총 음식의 가격을 측정하시오.
        *
        * ex)
        * 음식의 무게 : 8.5kg
        * Kg당 가격 : 300원
        *
        * 음식의 가격 : 2400원
        * */

        double weight = 8.5;
        int iweight = (int) weight;
        int kgPrice = 300;

        int foodPrice = iweight * kgPrice;
        System.out.println("foodPrice = " + foodPrice);
    }
}
