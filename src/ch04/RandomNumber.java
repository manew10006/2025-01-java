package ch04;

public class RandomNumber {
    public static void main (String[] args) {
        // API (내가 만든게 아닌 남이만든거 호출해서 쓰는 것, 자바에서 API들이 있다)
        // Math.random() double 타입 리턴, 0.00000000 ~ 0.999999999...  , 절대 1이 안 나온다.
        System.out.println( Math.random() );

        double value = 0.9999;
        double result = value * 10.0d; // 9.9999 , 10만 적으면 더블과 인트라 서로 데이터타입이맞지않아 자동형변환이 일어나는데 .0d를 표시하면서 데이터타입을 맞춘다
        System.out.println( "result: " + result);


        //강제 형변환, 명시적 형변환
        int intResult = (int)result;  // 정수타입으로 바꿈
        System.out.println( "intResult: " + intResult);

        double value2 = 0.00002;
        System.out.println("value2: " + (int)(value2 * 10.0) ); // 0


        System.out.println( (int)(Math.random() * 10.0) ); // 0 ~ 9

    }
}
