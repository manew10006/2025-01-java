package ch04;

public class Mission05 {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) + 2; //(1) 2~7사이 랜덤값
        System.out.printf("starCount: %d\n", starCount);

        // starCount = 3;
        // ***

        // starCount = 7;
        // *******

        // starCount = 2;
        // **  등 별이 갯수별로 찍히도록 하기

        for(int i = 0 ; i < starCount ; i++){
            System.out.printf("*");
            }


}}
