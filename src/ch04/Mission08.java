package ch04;

public class Mission08 {
    public static void main(String[] args) {
       /*
        int sum = 0 ;

        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;


        System.out.println("sum: " + sum); // 6
        */

        // 1~100 모두 더한 값 출력하세요
        int sum = 0;
        for(int i = 0 ; i <= 100 ; i++){
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}
