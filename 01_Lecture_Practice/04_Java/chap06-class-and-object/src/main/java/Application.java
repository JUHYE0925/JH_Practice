import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        Teacher lecture = new Teacher();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============= 강의 듣기 프로그램 ==============");
            System.out.println("1. 강의 시작");
            System.out.println("2. 설명 듣기");
            System.out.println("3. 강의 내용 이해하기");
            System.out.println("4. 강의 끝내기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int num = sc.nextInt();

            switch(num){
                case 1 : lecture.startLecture(); break;
                case 2 : lecture.startExplain(); break;
                case 3 : lecture.doUnderstanding(); break;
                case 4 : lecture.finishLecture(); break;
                case 9 :
                    System.out.print("강의실을 나가면서 "); break;
                default :
                    System.out.println("잘못 누르셨습니다. 번호를 제대로 눌러주세요."); break;
            }
            if(num == 9){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
