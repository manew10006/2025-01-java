package ch02.sec01;

public class PrintVsPrintln {
    public static void main (String[] args) {
        //print
        System.out.print("안녕");
        System.out.print("안녕");


        // println는 마지막에 개행(엔터)을 해준다
        System.out.println("-------------------");


        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");

        System.out.println("-------------------");


        //print + 개행(이스케이프 문자 \n)
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\\n"); //두번써야 문자로 출력

        //쌍따옴표 표시법
        System.out.print(" \"안녕\" ");

        System.out.println();
        System.out.println("-------------------");

        //printf
        int age = 22;
        String name = "홍길동";
        float height = 172.5f; //실수(소수점도 가능)
        // age, name, height 변수를 활용하여 아래처럼 출력시켜주세요.
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm입니다.

        System.out.println("제 이름은 " + name + "살이며 나이는" + age + "이며 키는 " + height + "cm 입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm 입니다. \n", name , age , height);

    }
}
