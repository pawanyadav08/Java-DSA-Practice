public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9,5};
        int target = 7;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element Found at index " + i);
                return;
            }
        }
        System.out.println("Element Not found");
    }
}
