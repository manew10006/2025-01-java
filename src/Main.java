//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
mutiLine Comment

 */
// singleLine Comment

// class 이름 Pascal Case 로 작성을 해야한다.
/* my name is hong
파스칼 케이스 : 클래스이름 (소문자로 적으면 클래스이름 아님, 대문자로 시작할것)
카멜 케이스에 : 크래스 외에
클래스라는 그릇을 만들어야 한다.
 그릇에는 코드가 작성된다 ( 메소드, 변수 등등)
 클래스 이릉은 파일 이름과 같아야한다.
 메소드는 함수라고 보면된다.
 메인 메소드는 굉장히 중요한 메소드이다. 프로그램의 시작점
 메소드를 만드는 것은 "메소드" 정의" 라고 표현
 메소드를 사용하는 것은 "메소드 호출"라고 표현
 메소드가 호출되면 메소드 내용이 한 줄씩 한 줄씩 실행이 된다.

 */


public class Main {
    public static void main(String[] args) { //메소드 (Method), 메인 메소드

        System.out.printf("Hello and welcome!"); // 콘솔에 내용을 출력하라.

        for (int i = 1; i <= 5; i++) { // 반복문, for-loop
            System.out.println("i = " + i);
        }
    }
}

