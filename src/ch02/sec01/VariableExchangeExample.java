package ch02.sec01;

public class VariableExchangeExample {
    public static void main (String[] args){
        int x = 3 ,y = 5 ;
        System.out.println("x: " + x + ", y:" + y);

        // 스와핑 (교환) 시 임시 공간이 필요하다!

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + ", y:" + y);
    }
}
