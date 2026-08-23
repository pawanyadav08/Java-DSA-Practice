import java.util.*;

public class array1 {
    public static void main(String args[]) {
        int arr[] = {3,2,-5,21,10};
        int n = arr.length;
        int minValue = arr[0];

        for(int i = 0 ; i < n ; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
//        int marks[] = {10,20,30,40,50};
//        int mul = 1;
//        for(int i = 0; i < marks.length ; i++) {
//           int value = marks[i];
//           mul = mul * value;
//       }
//        System.out.println(mul);
    }
}