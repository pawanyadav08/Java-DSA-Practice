public class removeDuplicate {
    public static void main(String[] args) {
      int[] arr = {1,1,2,4,4,2,3};
      
      int j = 0;

      for(int i = 1; i < arr.length; i++){
        if (arr[i] != arr[j]){
            j++;
            arr[j] = arr[i];
        }
      }

      for(int i = 0; i <= j; i++){
        System.out.println(arr[i] + " ");
      }
    }
}
