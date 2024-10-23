import java.util.Scanner;

public class Practice03_JH {

    /* 3. 1부터 100까지의 난수를 발생시킨 뒤 up/down 게임을 진행하는 코드를 작성하시오. */
    
    public void method3(){

        int randomNum = (int)(Math.random() * 100 ) + 1;
        // System.out.println("randomNum = " + randomNum);
        
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("1과 100 사이 중 하나의 숫자를 입력해주세요 : ");
            int answer = sc.nextInt();
            
            if(randomNum == answer){
                System.out.println("정답입니다.");
                break;
            } else if(answer < randomNum){
                System.out.println("up");
                continue;
            } else if(answer > randomNum){
                System.out.println("down");
                continue;
            }
        }
    }

}
