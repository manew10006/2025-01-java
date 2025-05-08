package ch02.sec01;

public class Mission01 {
    //메인 메소드 작성
    public static void main(String[] args){
        int num1 = 11;
        int num2 = 22;

        System.out.println("num1: " + num1 + num2); //num1: 1122
        // 문제되지 않을거같을때는 자동형변환 해줌. 문제될거같으면 컴파일에러!
        System.out.println("num1: " + (num1 + num2)); // num1: 33 (괄호를 우선 계산한다) ㅇㅇ
    }
}
