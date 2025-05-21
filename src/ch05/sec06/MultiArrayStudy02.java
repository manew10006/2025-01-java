package ch05.sec06;

public class MultiArrayStudy02 {
    public static void main(String[] args) {
        int[] arr2 = { 70 };
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                arr2
        };

        // 배열이름[가장바깥배열][그다음바깥배열][그다음..]

        System.out.println("arr.length: " + arr.length); // 3
        System.out.println("arr[0].length: " + arr[0].length); // 3
        System.out.println("arr[0].length: " + arr[2].length); // 1

        int[] child0 = arr[0];

        System.out.println("---------------------");


        for(int i=0; i < arr.length; i++){
            for(int k=0; k < arr[i].length; k++) {
                System.out.println(arr[i][k]);
            }
        }
    }
}
