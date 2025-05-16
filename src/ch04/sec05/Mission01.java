package ch04.sec05;

import java.util.Scanner;

public class Mission01 {

    /*
합계를 구할 숫자를 입력하세요. ( 종료 : 0)
>> 100
>> 200
>> 300
>> 400
>> 0
합계: 1000
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;


        int sum = 0;


        while(run){
            System.out.print("숫자를 입력하시오: ");
            int num = scanner.nextInt();
            if(num == 0){
                run = false;
                System.out.printf("합계: %,d" , sum);
            }else {
                sum = sum + num;
            }



/*
            while(run){
                System.out.print("숫자를 입력하시오: ");
                int num = scanner.nextInt();
                sum = sum + num;
                System.out.println("합계: " + sum);
                if(num == 0){
                    run = false;
                    System.out.println("합계: " + sum);
                }
                */

        }

    }
}
