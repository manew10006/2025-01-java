package ch04.sec02;

public class IfElseExample {
    public static void main (String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else { //두가지 조건일때 쓰임 ~아니면 이거실행!
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }

    }
}
