import java.lang.classfile.attribute.LineNumberTableAttribute;

public class ArrayQUESTIONS {

    static void getAverqage(int[] arr){
        //Find the average of array elements
        int sum = 0;
        for (int i : arr){
            sum +=i;//tc = O(n) sp = O(1)
        }
        double avg = (double) sum /arr.length;
        System.out.println("Average : " + avg);
    }
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i = 0; i < size ; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }
    public static void main(String[] args) {
//        int[] arr = {2,4,3,3};
//        getAverqage(arr);
        int arr[] = {1,2,3,4,5};
        int ans[] = multiplyBy10(arr);
        System.out.println("Printing ans Array : ");
        for(int i : ans){
            System.out.println(i);
        }
    }
}
