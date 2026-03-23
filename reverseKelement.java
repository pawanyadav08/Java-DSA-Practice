public class reverseKelement {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      int k = 3;
      
      int left = 0 , right = k - 1;
      while(left<right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
      for (int num : arr){
        System.out.println(num + " ");
      }
    }
}
