package ch04.sec02;

public class IfElseIfElseExample {
    public static void main (String[] args) {
        int score = 93;


        if(score >= 90) { // if문 내에서 한 번만 사용가능
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else if (score >= 80 ) { //else if 는 계속 적을 수 있다.
        System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score >= 70 ) { //else if 는 계속 적을 수 있다.
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        } else {// if문 내에서 한 번만 사용가능
            System.out.println("점수가 80점 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
        System.out.println("--끝--");
    }
}
