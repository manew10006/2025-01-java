package ch04.sec08;

public class Game369 {
    public static void main(String[] args) {
        for(int i=1; i <=100; i++){
            System.out.printf("i=%d ",i);

            int temp = i;  //반복문에 영향을 주지않기위함!
            do {
                if( temp % 10 % 3 == 0 && temp % 10 != 0){
                    System.out.print("짝");
                }
            }while((temp /= 10) != 0);  // 한 자리수씩 없애는ㅇㅇ
            //temp = temp / 10;     => temp값이 바뀐다

            System.out.println();
        }

    }
}
