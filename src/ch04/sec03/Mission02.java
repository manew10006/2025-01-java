package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        int score = (int)(Math.random()*116.0 )+5;

        //switch 이용해서 단!!! 겁나 나이쓰하게~
        //만약 score 값이 100~90 사이면 A학점

        System.out.println("점수:" + score);


        switch (score/10){
            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("측정불가");
                break;
        }

    }
}
