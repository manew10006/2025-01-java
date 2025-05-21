package ch05.sec06;

import java.util.Arrays;

public class DeepCopy {
    public static void main (String[] args){
        
        int[] arr1 = {10, 20, 30 };
        int[] arr3 = arr1;  //얕은복사

        // arr1를 이용하여 똑같은 배열을 만든다
        // 1. 똑같은 크기의 공간 할당
        int[] arr2 = new int[arr1.length];
        // 2. arr1 배열의 값을 arr2 배열에 데이터를 같은 인덱스에 복사

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }


        System.out.println( arr1 + "\n" + arr2 + "\n" + arr3);  // 주소값확인
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        arr1[1] = 1;  // arr2 는 바뀌지않는다


    }
}
