package ch03;

public class IncreaseDecreaseOperatorExample02 {
    public static void main(String[] args) {
        // 증감식

        int i1 = 5;
        System.out.printf("i1: %d \n" , i1);
        // System.out.printf("i1: %d \n" , i1);
        // i1 = i1 + 1 ;

        int i2 = 5;
        System.out.printf("i2: %d \n", i2);
        // i2 = i2 + 1 ;
        // System.out.printf("i1: %d \n" , i2);
        
        // 읽기 > 쓰기
        // int i1 = 5;
        System.out.printf("i1: %d \n" , i1++);
        System.out.printf("i1: %d \n" , i1++);
        System.out.printf("i1: %d \n" , i1);

        System.out.println("================");
        
        // 쓰기 > 읽기
        // int i2 = 5;
        System.out.printf("i2: %d \n", ++i2);
        System.out.printf("i2: %d \n", ++i2);
        System.out.printf("i2: %d \n", i2);
    }
}
