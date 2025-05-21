package ch05.sec06;

public class MultiArrayStudy {
    public static void main(String[] args) {
        /*
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60 };

        2차원 배열  (3차, 4차도 []개수와 {a,b..} 를 추가하면된다
        int[][] parent = { arr1, arr2 };

        int[][][] parent3 = null
        int[][][][] parent4 = null
        > parent4은 parent3의 배열 (4-1 같이 건너뛰기 안됨)

         */

        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60 };


        int[][] parent = { arr1, arr2 };
        System.out.println(parent[0][1]); //20
        System.out.println(parent[1][1]); //50


    }
}
