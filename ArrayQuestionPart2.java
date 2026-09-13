import java.util.HashMap;

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

    static int getMode(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num,0) + 1);
        }
//        for (int i : freq.keySet()){
//            System.out.println(i + "->" + freq.get(i));
//        }
        int maxFreq= -1;
        int maxFreqWaliKey = -1;

        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if(currentKeyKiFrequency>maxFreq){
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        return maxFreqWaliKey;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        int ans = getMode(arr);
        System.out.println(ans);
//        printAlternate(arr);
//        reverseArray(arr);
//        shiftBy1(arr);
//        for(int a: arr){
//            System.out.print(a + " ");
//        }


    }
}
