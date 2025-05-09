package ch04;

public class EvenOdd {
    public static void main(String[] args) {
        // 홀, 짝 + 랜덤 숫자

        int num = 11;
        // % (mod) 연산자 사용, 나머지값을 구한다.
        System.out.printf("%d / %d = %d \n", num , 5, num / 5);
        System.out.printf("%d %% %d = %d\n" , num  , 5 , num % 5 ) ;
        System.out.printf("%d / %d = 몫은 %d 나머지는 %d 입니다. \n", num , 5, num / 5 , num % 5 );

        //mod를 활용해 짝, 홀인지 구분
        if( num % 2 == 0 ) {
            System.out.printf("%d는(은) 짝수입니다. \n", num);
        } else {
            System.out.printf("%d는(은) 홀수입니다.\n", num);
        }

        System.out.println("--끝--");

    }
}
