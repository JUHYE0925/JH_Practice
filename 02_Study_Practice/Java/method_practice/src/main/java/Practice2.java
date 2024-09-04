import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {


        /* 문제1. main() 밖에서 두 수의 합에 작은값을 곱하는 메서드를 만든 뒤 main()에서 호출한다*/
        
        Practice2 method1 = new Practice2();
        int calc = method1.cal(20,5);
        System.out.println("calc = " + calc);

        /* 문제2. main() 밖에서 -10부터 50까지의 난수를 생성하는 메서드를 만든 뒤 main()에서 호출한다*/
        
        Practice2 method2 = new Practice2();
        int random = method2.random();
        System.out.println("random = " + random);

        /* 문제3. main() 밖에서 스캐너로 사용자의 나이를 입력할 수 있는 메서드를 만든 뒤 main()에서 호출한다*/

        Practice2 method3 = new Practice2();
        method3.Age();


        
    }
    
    public int cal(int a, int b){
        
        int calculator = (a + b) * Math.min(a, b);
        return calculator;
    }
    
    public int random(){
        
        int random = (int)(Math.random() * 61) +(-10);
        return random;
    }

    public void Age(){
        Scanner sc=new Scanner(System.in);
        System.out.println("나이를 입력하세요. : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}
