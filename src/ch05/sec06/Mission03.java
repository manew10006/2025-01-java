package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40};
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
        // 위와 똑같이 나오게 배열만들기

//        System.out.printf("%d",num);
//        System.out.print(", ");


        System.out.print("[");

        for(int i = 0; i < arr.length; i++ ){ // 배열번호까지~
            System.out.print(arr[i]);
            if ( i != arr.length -1 ) {  // 3이 아니면 찍어라!
                System.out.print(", ");
            }
            }
        /*
        for (int i = 0; i<arr.length; i++){
         System.out.print(arr[i] + (i < arr.length -1 ? "," : ""))
        }

        if( i != 0) 으로 해도된다 (점을 먼저 찍는방식)

                 */


        System.out.print("]");
    }
    }

