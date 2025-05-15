package ch04.sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (여/남) > " );
        String gender = scanner.next();
        System.out.println("gender: " + gender);

        // w 입력하면 " 당신은 여자입니다. "
        // m 입력하면 " 당신은 남자입니다. " 출력

        /*
        switch (gender){
            case "여":
                System.out.println("당신은 여자입니다.");
                break;
            case "남":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println("여 / 남 만 입력하세요");
        } */

        /*
        if(gender.equals("여")){
            System.out.println("당신은 여자입니다.");
        }else if(gender.equals("남")) {
            System.out.println("당신은 남자입니다.");
        }else {
            System.out.println("성별을 입력하세요");
        }

         */


        // 이퀄스 비교 시 리터럴이 앞에 오는게 좋다
        // ignoreCase = 대소문자 무시, 비교값을 둘다 소문자로 치환해서 비교한다!
        if("w".equalsIgnoreCase(gender) || "m".equalsIgnoreCase(gender)){
        System.out.println( gender.equals("w") ? "여자입니다" : "남자입니다.");
     }else { System.out.println("성별을 입력하세요"); }
}}
