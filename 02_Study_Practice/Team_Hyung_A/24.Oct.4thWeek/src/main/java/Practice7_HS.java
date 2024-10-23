public class Practice7_HS {

   /* 0~15 범위의 난수를 생성하고
    난수가 10이상일 경우 "당첨입니다." 10미만일 경우 "아쉽네요"를 반환하세요.*/

    public void method7(){

        int random = (int)(Math.random() * 16);

        if(random >= 10){
            System.out.println(random + "이(가) 뽑혔네요.");
            System.out.println("당첨입니다.");
        } else if(random < 10){
            System.out.println(random + "이(가) 뽑혔네요.");
            System.out.println("아쉽네요.");
        }

    }


}
