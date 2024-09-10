import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Practice1 method1 = new Practice1();
    Scanner sc= new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.println("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("성별을 입력해주세요 : ");
        char gender = sc.nextLine().charAt(0);

    }
}
