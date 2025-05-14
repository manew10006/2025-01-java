package ch04;

public class Mission11 {
    public static void main(String[] args) {
        //2 ~ 9단 구구단 출력 단수가 바뀔 때 개행처리

        for (int i = 2 ; i <= 9; i++){

            for(int j = 1 ; j <= 9; j++){
                System.out.printf("%d x %d = %d \n", i, j, i * j);
            }
            System.out.println();
        }
    }}
