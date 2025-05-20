package ch05.sec06;

public class EnhancedFor {
    /*
    향상된 for 문

      배열같은 시퀀스가 있는 컬렉션에서 사용하가능하다

      for(하나의 값 담을 수 있는 변수 : 컬렉션) {

      }
      
        읽기 전용이다      

     */
    public static void main(String[] args) {
        int[] intArr = { 13, 12, 19, 33, 45};
        for(int num : intArr) { // 데이터타입 변수명 : 콜렉션 
            System.out.println(num);
        }

        System.out.println("------------------------------------------");
        for ( int i= 0 ; i<intArr.length; i++){
            int num = intArr[i];
            System.out.println(num);
        }
    }
}
