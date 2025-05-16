package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100.0) + 1 ;

        /*
        1~100 사이 숫자를 입력해주세요 > 50
        down!
        1~100사이 숫자를 입력해주세요 > 25
        up!
        맞출때까지 반복한다.

        정답!!
         */


        boolean run = true;

        while(run){
            System.out.print("숫자를 입력하세요 : ");
            int num = scanner.nextInt();

            if (answer == num){
                run = false;
                System.out.println("정답입니다 ^▽^ ");
            }else if(answer > num ){
                System.out.println("UP!");
            }else if(answer < num ){
                System.out.println("DOWN!");
            }

    }
}}
