import java.io.*;
public class Reverse {

    public static void rev(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] q1 = {1, 2, 3, 4, 5, 6, 7, 8}; //{8,7,6,5,4,3,2,1}
        int[] q2= {2,4,6,8,10,12,14,16,18,20}; //{20,18,16,14,12,10,8,6,4,2}
        rev(q1);
        System.err.println();
        rev(q2);  
    }
}