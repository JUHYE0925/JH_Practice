import java.util.Scanner;

public class Student {

    /*
    * 객체 : 나 선생님

    요구사항

    1. 선생님은 강의 시작하기, 설명하기, 이해시키기, 강의 끝내기를 할 수 있다.
    2. 나는 강의 시작하기, 설명듣기, 이해하기, 강의 끝내기를 할 수 있다.
    3. 나는 강의를 시작하지 않은 채로 대기하고 있는다.
    4. 선생님은 강의를 시작한다. 이미 강의가 시작되어 있는 경우 다시 강의를 시작할 수 없다
    5. 나는 강의를 시작한다.
    6. 선생님이 설명을 한다. 내가 강의를 시작하지 않으면 선생님이 강의 시작하라고 말씀하신다.
    7. 나는 설명을 듣는다. 설명을 듣지 않는 경우 선생님이 이해시키기를 진행하지 않는다.
    8. 선생님은 이해시킨다. 선생님이 이해시키기를 하지 않으면 질문한다.
    9. 나는 이해를 한다. 만약 내가 이해 못할 경우 선생님께 질문을 한다.
    10. 선생님은 강의를 끝낸다. 강의가 끝난 상태에서는 강의를 끝낼 수 없다.
    11. 나는 강의를 끝낸다. 강의를 끝낸 상태에서는 강의를 끝낼 수 없다.

    객체간 상호작용

    - 선생님이 수신할 수 있는 메세지
    1. 강의를 시작하라
    2. 설명을 해라
    3. 이해를 시켜라
    4. 강의를 끝내라

    - 내가 수신할 수 있는 메세지
    1. 강의를 시작해라
    2. 설명을 들어라
    3. 이해를 해라
    4. 강의를 끝내라

    * */

    private boolean isStart;
    private boolean isUnderstand;

    public void startLecture(){

        if(isStart){
            System.out.println("강의가 이미 시작하였습니다. 자리에 앉아주세요.");
        } else{
            this.isStart = true;
            System.out.println("강의를 시작합니다.");
        }
    }

    public void listening() {
        if (isStart){
            this.isUnderstand = true;
            System.out.println("강사님의 설명을 듣습니다.");
        } else {
            System.out.println("강의가 아직 시작하지 않았습니다.");
        }
    }
    public void understandingExplain() {

        if (isStart) {
            if (isUnderstand) {

                Scanner sc = new Scanner(System.in);
                System.out.println("이해 여부 : 1. 이해되었다. 2. 이해가 안되었다.");
                int understanding = sc.nextInt();

                if (understanding == 1) {
                    System.out.println("이해가 되어 다음으로 넘어가도 좋습니다.");
                } else {
                    System.out.println("설명을 제대로 듣지 못하여 이해가 가지 않으니 질문을 해야겠습니다.");
                    this.isUnderstand = true;
                }
            } else {
//                this.startLecture = true;
                System.out.println("강사님의 설명을 아직 듣지 않았습니다. 먼저 설명을 들어주세요.");
            }
        }else{
            System.out.println("강의를 시작하지도 않았습니다. 강의를 먼저 시작해주세요.");
        }
    }
    public void finishLecture(){
       if(isStart){
               this.isStart = false;
               System.out.println("모든 강의를 성공적으로 이해했다.");
       } else {
           System.out.println("강의는 이미 끝났습니다. ");
       }
    }



}
