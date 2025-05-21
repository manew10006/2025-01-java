package ch05.sec06;

public class CopyStudy {
    public static void main (String[] args){
        
        //배열 만드는 3가지 방법
        //int[] arr1 = new int[10];
        int[] arr2 = {10, 20, 30};
        //int[] arr3 = new int[] {10, 20, 30};

        int[] temp = arr2;
        temp[1] = 200;  // Shallow Copy
        
    }
}
