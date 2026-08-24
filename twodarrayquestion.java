public class twodarrayquestion {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{21,20,19}};
        int maxValue = arr[0][0];

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                if(maxValue < arr[i][j]){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("The maximum value is " + maxValue);
//        int mul = 1;
//
//        for(int i = 0 ; i < arr.length; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
////                sum = sum + arr[i][j];
//                mul = mul * arr[i][j];
//            }
//        }
//        System.out.println("The mul is = " + mul);

    }
}
