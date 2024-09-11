import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player program = new Player();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("============ 레이싱 프로그램 =============");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int num = sc.nextInt();

            switch(num){
                case 1 : program.turnOn(); break;
                case 2 : program.speedUp(); break;
                case 3 : program.stepBreak(); break;
                case 4 : program.turnOff(); break;
                case 9 :
                    System.out.println("프로그램 종료");
                default :
                    System.out.println("제대로 된 번호를 눌러주세요.");
            }
            if(num == 9){
                break;
            }
        }
    }


}

