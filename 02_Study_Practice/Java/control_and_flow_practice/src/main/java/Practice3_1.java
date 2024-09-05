import java.util.Scanner;

public class Practice3_1 {

    public static void main(String[] args) {

        // switch문 문제

        /* 달을 입력하면 계절을 알려주는 프로그램을 만들어보시오. */
        //예) 달을 입력하세요 : 1
        //    입력하신 1월은 겨울 입니다.
        //    달을 입력하세요 : 13
        //    해당하는 달이 존재하지 않습니다.


        Practice3_1 method = new Practice3_1();
        method.season();



    }

    public void season(){

        Scanner sc = new Scanner(System.in);
        System.out.println("달을 입력해주세요 : ");
        int month = sc.nextInt();
        String currentSeason = "";

        if(month >= 1 && month <= 12){
            switch(month){
                case 1 :
                    currentSeason = "겨울";
                    break;
                case 2 :
                    currentSeason = "겨울";
                    break;
                case 3 :
                    currentSeason = "봄";
                    break;
                case 4 :
                    currentSeason = "봄";
                    break;
                case 5 :
                    currentSeason = "봄";
                    break;
                case 6 :
                    currentSeason = "여름";
                    break;
                case 7 :
                    currentSeason = "여름";
                    break;
                case 8 :
                    currentSeason = "여름";
                    break;
                case 9 :
                    currentSeason = "가을";
                    break;
                case 10 :
                    currentSeason = "가을";
                    break;
                case 11 :
                    currentSeason = "가을";
                    break;
                case 12 :
                    currentSeason = "겨울";
                    break;
            }
            System.out.println("입력하신 " + month + "월은 " + currentSeason + "입니다.");

        } else {
            System.out.println("해당하는 달이 존재하지 않습니다.");
        }



    }
}

