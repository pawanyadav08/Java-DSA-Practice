public class twodarray {
    public static void main(String[] args) {
        int [][] arr;
        arr = new int[3][4];
        int[][] brr = {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };
//        System.out.println(brr[3][0]);
        int rowLength = brr.length;
        int colLength = brr[0].length;
        for(int rowIndex = 0; rowIndex < rowLength; rowIndex++){
            for(int colIndex = 0; colIndex < colLength ; colIndex++){
                System.out.println(brr[rowIndex][colIndex]);
            }
        }
    }
}
