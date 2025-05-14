package ch04;

public class Mission09 {
    public static void  main(String[] args){
        int dan = (int)(Math.random()*8.0) + 2; //2~9 사이 랜덤 값을 생성하시오
        System.out.println("dan: " + dan);


        /*
        dan: 2
        2 X 1 = 2
        2 X 2 = 4
        2 x 3 = 6
        ...
        2 X 9 = 18

        ...

         */

        for(int i = 1 ; i <= 9 ; i++){
            System.out.printf("%d x %d = %d\n" , dan, i , dan*i);
        }
    }
}
