package ch04;

public class Mission04 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 201.0); // 0~200 사이의 랜덤값

        // 만약 score 값이 100 ~ 90점 사이라면 A학점
        // 만약 score 값이 80 ~ 89점 사이라면 B학점
        // 만약 score 값이 70 ~ 79점 사이라면 C학점
        // 만약 score 값이 70점 미만이면 D학점
        // 만약 score 값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력

        System.out.printf("%d \n", score);

        if(score <= 100 && score >= 90){
            System.out.println("A학점 \n");
        } else if (score < 90 && score >= 80){
            System.out.println("B학점 \n");
        }else if (score < 80 && score >= 70){
            System.out.println("C학점 \n");
        }else if (score < 69){
            System.out.println("D학점 \n");
        }else {
            System.out.println("측정 불가");
        }

        // 돔쌤 ver

        if(score < 0 || score > 100) { //0미만 혹은 100초과인 경우 (큰 범주로 한 번 거른다)
            System.out.println("측정 불가");
        }else if(score >= 90){ // 90 ~ 100 사이
            System.out.println("A학점 \n");
        }else if(score >= 80){ // 80 ~ 89 사이
            System.out.println("B학점 \n");
        }else if(score >= 70){ // 70 ~ 79 사이
            System.out.println("C학점 \n");
        }else{ // 0 ~ 69 사이
            System.out.println("D학점 \n");
        }
    }
}
