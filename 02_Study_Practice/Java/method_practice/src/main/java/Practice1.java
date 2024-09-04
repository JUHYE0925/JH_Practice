public class Practice1 {
    public static void main(String[] args) {

        /* 메인함수 밖에 두 수의 대소를 비교하여 큰 수를 반환하는 함수를 작성한 후 메인 함수에서 호출하시오. */

        Practice1 max = new Practice1();
        int compareNumber = max.compareNumber(10,30);
        System.out.println("두 수 중 큰 값은 : " + compareNumber + "이다.");

        /* 메인 함수 밖에 10부터 100까지 중 난수를 출력하는 함수를 작성한 후 메인 함수에서 호출하시오. */
        Practice1 random = new Practice1();
        random.number();
    }

    public int compareNumber(int a, int b){
        return Math.max(a, b);
    }

    public void number(){
        int random = (int)(Math.random() * 91) + 10;
        System.out.println("1부터 100까지 중 당신의 번호는 " + random + "번 입니다.");
    }

}

