package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    /*(프린트 반복 실행)
---------------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
---------------------------------
선택 >


(실행 예시)
선택 > 1 (엔터)
예금액 > 10000 (엔터)

[[ 프린트 ]]

선택 > 2 (엔터)
출금액 > 2000 (엔터)

[[ 프린트 ]]

선택 > 3 (엔터)
잔고 > 8,000원

[[ 프린트 ]]

선택 > 4 (엔터)

프로그램 종료
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int sum = 0;


        bank:
        while(run){
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");
            int select = scanner.nextInt();
            int num = 0;


            if(select > 4  ){

                System.out.println("1~4를 선택해주세요 ^^");

            }else {  // 1~4
            switch (select) {
                case 1:
                    System.out.print("금액 : ");
                    num = scanner.nextInt();
                    sum += num;
                    System.out.printf("예금후잔액 : %d\n", sum);
                    break;

                case 2:
                    System.out.print("출금액 : ");
                    num = scanner.nextInt();
                    sum -= num;
                    if(sum < 0){
                        System.out.println("잔액이 부족합니다");
                        sum += num;
                        System.out.printf("잔액: %d\n", sum);
                        break bank;
                    }else{
                    System.out.printf("출금후잔액: %d\n", sum);}
                    break;

                case 3:
                    System.out.printf("잔고: %d\n", sum);
                    break;

                default:
                    System.out.println("-- 종료 ↖^◇^↗ -- ");
                    break bank;

            }
            }
        }
    }
}

