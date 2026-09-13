public class ArrayQuestionPart2 {

    static void reverseArray(int arr[]){
        //2 pointer
        //tc = O(n)
        //sc = O(1)
        int n = arr.length;
        int i = 0;
        int j = n -1;

        while (i <= j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k: arr){
            System.out.println(k);
        }
    }

    static void shiftBy1(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1 ; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    static void printAlternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n -1;
        while(i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printAlternate(arr);
//        reverseArray(arr);
//        shiftBy1(arr);
//        for(int a: arr){
//            System.out.print(a + " ");
//        }


    }
}
