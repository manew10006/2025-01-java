package ch04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0 ) + 3; // 3~8까지 랜덤 값

        System.out.println("star: " + star);

        /*
        star = 3
        *
        **
        ***

         */

        for(int i = 1; i <= star ; i++){
            for(int j = 1 ; j <= i ; j++){
            System.out.print("*");
        }
            System.out.println();
        }

    }
}
