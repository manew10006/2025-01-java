package ch04.sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (여/남) > " );
        String gender = scanner.next();
        System.out.println("gender: " + gender);


        switch (gender){
            case "여","w","W","여자","여성":
                System.out.println("당신은 여자입니다.");
                break;
            case "남", "m", "M","남자","남성":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println("성별을 입력하세요.");

        }
        scanner.close(); //쓰기가 리소스를 많이 잡아먹어서 닫아주는게 필요하다
}
}
