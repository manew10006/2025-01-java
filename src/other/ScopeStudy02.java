package other;

public class ScopeStudy02 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            int sum = 0; // 얘는 10번 반복될텐데 왜 되냐!? >> for문은 한 번 반복하고나서 그 {}구문이 죽고 새로 생성되는 원리기 때문
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){
            int sum2 = 0;
            sum2 = sum2 + i; //이렇게 되면 계속 죽었다 살아나는 거라 0+i 만 된다
            System.out.println(i);
        }
    }
}
