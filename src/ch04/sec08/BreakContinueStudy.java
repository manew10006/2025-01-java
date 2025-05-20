package ch04.sec08;

public class BreakContinueStudy{
    public static void main(String[] args) {
        // 10번 반복하는 for문 2개 작성

        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println();
                break; //for문을 바로 빠져나온다
            }
            System.out.println(i);
        }
                System.out.println("--------------");

        for(int i = 0; i < 10; i++){
            if (i == 5) {
                continue; // 바로 증감식으로 간다 (skip)
            }
            System.out.println(i);
        }
    }
}
