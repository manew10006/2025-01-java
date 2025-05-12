package ch03.sec07;
//p. 94
public class LogicalOperatorExample {
    public static void main (String[] args) {
        int num1 = 5;
        int num2 = 0;

        System.out.printf("%d > %d : %b\n", num1, num2, num1 > num2);
        
        // && and 연산자  ture && true == true
        System.out.printf("%d > %d && %d > %d : %b \n", num1, num2, num1, 2, num1 > num2 && num1 > 2);

        // || or 연산자  ture || false == true
        System.out.printf("5 > 0 || 5 < 2 : %b \n", 5 > 0 || 5 < 2);

        // ! 반대
        System.out.printf("!(5 < 0 || 5 < 2) : %b \n", !(5 < 0 || 5 < 2));
        System.out.printf("!false : %b \n", "!false");


    }
}
