public class Practice02_JH {



    /* 2. 반복문을 사용하여 1부터 1000까지 난수 발생 시키되 난수와 난수의 역순이 같은 경우만 출력되게 하시오.
    *  ex) 난수 : 121 / 난수의 역순 : 121 ->  출력
    *      난수 : 132 / 난수의 역순 : 231 -> 출력X
    *  */

    public void method2(){

        while(true) {
            String random = (int)(Math.random() * 1000) + 1 + "";

            StringBuilder builder = new StringBuilder(random);

            StringBuilder reverseRandom = builder.reverse();

            if (random.contentEquals(reverseRandom)) {
                System.out.println(random);
                 break;
            } else {
                continue;
            }
        }

        /*while(true) {
                String random = (int)(Math.random() * 1000) + 10 + "";

                StringBuilder builder = new StringBuilder(random);

                StringBuilder reverseRandom = new StringBuilder(builder.reverse());

                if (builder.equals(reverseRandom)) {
                    System.out.println(random);
                    break;
                } else {
                    continue;
                }
            }*/

    }
}
