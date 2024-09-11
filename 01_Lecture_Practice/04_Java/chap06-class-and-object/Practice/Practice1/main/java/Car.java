public class Car {
    private  boolean isTurnOn;
    private int speed;

    public void TurnOn(){
        if(isTurnOn){
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isTurnOn = true;
            System.out.println("시동이 걸렸습니다.");
        }
    }
    public void go(){
        if(isTurnOn){
            this.speed += 10;
            System.out.println("현재 자동차 시속은 " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
        }
    }
    public void stop(){
        if(isTurnOn){
            if(speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟아 현재 차를 멈춥니다.");
            }else {
                System.out.println("차가 이미 멈춰있습니다.");
            }
        }else{
            System.out.println("시동이 꺼져있습니다. 시동을 확인해주세요.");
        }
    }
    public void turnOff(){
        if(isTurnOn){
            if(speed > 0 ){
                System.out.println("달리는 중에 시동을 끌 수 없습니다. 우선 멈춰주세요.");
            } else {
                this.isTurnOn = false;
                System.out.println("시동을 끄겠습니다.");
            }
        } else {
            System.out.println("시동이 이미 꺼져있습니다. 시동을 확인해주세요.");
        }
    }
}
