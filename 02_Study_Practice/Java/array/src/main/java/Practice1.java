import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        /* 사용자에게 정수 3개를 입력받은 값으로 배열을 만든 후 해당 배열의 값보다 2배의 값을 같은 또다른 배열을 하나 생성하시오.
        *  예) "첫 번째 인덱스의 값을 입력하세요 :  10
        *      "두 번째 인덱스의 값을 입력하세요 :  20
        *      "세 번째 인덱스의 값을 입력하세요 :  30
        *
        *  출력 : numArr의 배열은 : { 10 20 30 }
        *        numArr2의 배열은 : { 20 40 60 }
        */


    }

    public void numnultiple(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 인덱스의 값을 입력하세요 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 인덱스의 값을 입력하세요 : ");
        int second = sc.nextInt();
        System.out.println("세 번째 인덱스의 값을 입력하세요 : ");
        int third = sc.nextInt();

        int[] numArr = new int[]{first, second, third};
        System.out.print("numArr의 배열은 : { ");
        for(int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] + " ");
        }
        System.out.print("}");
        System.out.println();

        int[] numArr2 = new int[3];
        for(int i = 0; i < numArr.length; i++){
            numArr2[i] = numArr[i] * 2;
        }
        System.out.print("numArr2의 배열은 : { ");
        for(int i = 0; i < numArr.length; i++){
            System.out.print(numArr2[i] + " ");
        }
        System.out.print("}");

    }
}
