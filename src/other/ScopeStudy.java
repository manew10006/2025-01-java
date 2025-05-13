package other;

public class ScopeStudy {
    /*
    스코프 : 변수가 살아있는 공간 ( LifeCycle )
            변수가 선언이 되면 자기 자신을 감싸고있는 중괄호안에서만 살아있다.
            즉, 중괄호를 벗어나면 죽는다.
    */

    public static void main(String[] args) {

        int num = 10;
        System.out.println(num); // 10

        for(int i = 0 ; i < 10; i++){
            // int i = 10   x 같은 스코프 안에서는 같은 이름의 변수 선언은 한 번만 하면 된다.
            System.out.println(i);
        }
        //System.out.println(i); // x i에 접근 할 수 없다.

    }

    /*
    public static void methodA() {

        System.out.println(num); // x (die)
    }
     */
}
