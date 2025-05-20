package ch04.sec07;

public class BreakOuterExample {
    public static void main(String[] args) {

        /*
        for(int i=2; i<=9; i++){
            for(int k=1; k<=9; k++){
                if(k == 5){
                    break; // 가장 가까운 for문을 끝낸다
                }
                System.out.printf("%d x %d = %d\n", i, k, i*k);
            }
        }
        System.out.printf("--끝--");

         */

        Loop1: //for문에 이름을 지을 수 있다
        for(int i=2; i<=9; i++){
            for(int k=1; k<=9; k++){
                if(k == 5){
                    break Loop1;
                }
                System.out.printf("%d x %d = %d\n", i, k, i*k);
            }
        }
        System.out.printf("--끝--");
    }
}
