package ch04.sec03;

// 매우 중요!
public class StringEqualStudy {
    public static void main(String[] args) {
        // 자바에서 가장 안 좋다고 평가되는 부분...
        String str1 = "hello";
        String str2 = "hello"; //자바가 효율이 좋아져서 이 스코프 안에서 서로 같은 주소값을 준다

        System.out.printf("1. %s === %s : %b\n", str1, str2, str1 == str2 ); // 문자열은 ==은 사용하면 안된다 (== 은 주소값 비교인데 주소값이 다른데 그걸 표시못함!)
        System.out.printf("2. %s === %s : %b\n", str1, str2, str1.equals(str2) ); // 문자열 비교는 이퀄스(값비교 메소드) 비교를 해야한다 순서는 상관없다

        String str3 = new String("hello");
        String str4 = new String("hello"); // 각각의 주소값에 생성되서

        System.out.printf("1. %s === %s : %b\n", str3, str4, str3 == str4 ); // false가 뜬다
        System.out.printf("2. %s === %s : %b\n", str3, str4, str3.equals(str4) );


        // switch는 자동으로 이퀄스 비교라 문자열 비교 시 편리하다
    }
}
