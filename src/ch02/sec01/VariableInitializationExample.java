package ch02.sec01;

public class VariableInitializationExample {
    public static void main (String[] args) {
        // int value;  변수 선언(변수명 당 최초 한 번), 선언을 할 때 데이터 타입 지정 (예 : int는 정수타입) 지정된 데이터타입외는 넣을 수 없음
        // 변수 사용 방법 2가지 : 읽기(read), 쓰기(write)

        /*
        에러(예외) 종류 크게 2가지
        - 컴파일 에러 : 실행을 할 수 없음, 컴파일(: 프로그래밍 언어를 0과 1로 변경해서 컴퓨터가 작동)해야하는데 이를 하지 못하는 것
                        문법적 문제가 있거나 명확한 문제가 보이면...
        - 런타임 에러 : 실행을 하는 도중에 에러가 발생

         */
        // int result = value + 10;  // value 아래에 빨간색 언더라인, 컴파일 에러


        int value;
        value = 10;
        int result = value + 10;


        System.out.println(result);



    }
}
