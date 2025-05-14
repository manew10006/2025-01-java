package ch04;

public class Mission12 {
    public static void main(String[] args) {
        /*
         2 x 1 = 2 \t  3 x 1 = 3 \t 4 x 1 = 4 ... 9 x 1 = 9
         2 x 2 = 4 ...
         */

        for(int i = 1; i < 10 ; i++){
            for(int j = 2; j < 10; j++){
                System.out.printf("%d x %d = %d\t",j , i , j*i);
            }
            System.out.println();

        }
    }
}
