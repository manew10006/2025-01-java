package ch04;

public class Mission03 {
    public static void main (String[] args) {
        int value = (int) (Math.random() * 101 + 1); // 1~100사이의 랜덤값 나오게 하고

        if (value % 2 == 0) {
            System.out.printf("%d는(은) 짝수입니다.\n", value);
        } else {
            System.out.printf("%d는(은) 홀수입니다.\n", value);
        }

        // 더 짧게!
        String oddEven = "홀";
        if(value % 2 == 0) {
            oddEven = "짝";
        }
        System.out.printf("%d는(은) %s수입니다. \n", value, oddEven);

        // 더 짧게!
        System.out.printf("%d는(은) %s수입니다.\n", value, value % 2 == 0 ? "짝" : "홀"); // 삼항식
    }
}





        // 랜덤값이 value = 5; 라면
        // 출력 : 5는 홀수입니다.

        // 랜덤값이 value = 97; 라면
        // 출력 : 97는(은) 홀수입니다.

        // 랜덤값이 value = 54; 라면
        // 출력: 54는(은) 짝수입니다.

