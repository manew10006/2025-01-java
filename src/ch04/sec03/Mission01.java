package ch04.sec03;

public class Mission01 {
    public static void main(String[] args) {
        int month = (int)(Math.random()*16.0);

        //switch 이용하여 month 값이 12, 1, 2 는 3,4,5는 봄, 6,7,8은 여름, 9,10,11은 가을로 출력, 나머지는 "해당 계절이 없습니다"
        System.out.println("month: " + month);
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3, 4, 5 :  // 최신문법 원래는 ,로 나열하고 -> 해야했는데 ㅎㅎ..
                System.out.println("봄");
                break;
            case 6, 7, 8 :
                System.out.println("여름");
                break;
            case 9, 10, 11 :
                System.out.println("가을");
                break;
            default:
                System.out.println("해당 계절이 없습니다");

        }
    }
}
