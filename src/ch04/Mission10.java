package ch04;

public class Mission10 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4.0) + 3; //3~6사이 램던 값
        System.out.printf("star: %d\n", star);

        /*
        star: 3
        ***
        ***
        ***

        star: 5
        *****
        *****
        *****

         for(int i = 0; i< star ; i++){

            for(int j = 0; j < star ; j++){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
        */



        // for문 하나로 적기

        int totalCount = star * star;
        for(int i = 1 ; i <= totalCount ; i++){
            System.out.print("*");
            if(i % star == 0){
            System.out.println();
            }

        }
    }}
