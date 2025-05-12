package ch04;

public class Mission01 {
    public static void main (String[] args){
        // 응용력 테스트

        // 5 ~ 10 사이 랜덤값 나올 수 있도록 해주세요

        for(int i=0; i<1; i++) {
            int result = (int)(Math.random() * 6.0 ) + 5  ;

            if(result < 5 || result > 10) {
                System.out.println("틀렸음!");
                break;
            }
            System.out.printf( "%d \n" , result );
        }
        System.out.println("-- 끝 --");
    }
}




// int result = (int)(Math.random() * 6 + 5);
// 1) Math.random()* 6 >> random()매소드는 double 값을 리턴(0.7가정)
// 2) 0.7 * 6 >>0.7 * 6.0 으로 정수타입 6이 더블타입 6.0으로 자동형변환
// 3) 0.7 * 6.0 >> 4.2
// 4) 4.2 + 5 >> 4.2 + 5.0으로 정수타입 5가 더블타입 5.0으로 자동형변환
// 5) 4.2 + 5.0 >> 9.2
// 6) (int)9.2 >> 9 으로 9.2 더블타입이 9 정수타입으로 강제 형변환


// 이렇게 하면 리소스를 더 많이 잡아먹는다 그러므로 아래처럼 괄호를 적을 것.

// int result = (int)(Math.random() * 6) + 5;
// 1) 0.7 * 6.0 >> 4.2
// 2) (int)4.2 >> 4
// 3) 4 + 5 >> 9