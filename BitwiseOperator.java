public class BitwiseOperator {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);
//        int n = 1;
//        for (int i = 0 ; i <= 34 ; i++){
//            n = n << 1;
//            System.out.println(n);
//            System.out.println();
//        }
//        int n = 100;
//        for (int i = 1 ; i <= 10 ; i++){
//            n = n >> 1;
//            System.out.println(n);
//            System.out.println();
//        }
//        int n = 10;
//        if((n & 1) == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//
//        int n = 7;
//        int count = 0;
//        while(n!= 0){
//            if((n&1) != 0){
//                count++;
//            }
//            n = n >>1;
//        }
//        System.out.println("Set bit count: " + count);
//        int n = 12;
//        if((n & (n-1)) ==0){
//            System.out.println("Power of 2 hai");
//        }else {
//            System.out.println("Power of 2 nahi hai");
//        }
//        System.out.println(3 << 2);
//        int n = 10;
////        System.out.println((n&(-n)));
//        int n = 10;
//        int count = 0;
//
//        while(n > 0){
//            count += n & 1;
//            n = n >> 1;
//        }
//        System.out.println(count);

        int[] arr = {1,2,3,5};
        int xor = 0;
        for (int i = 1 ; i <= 5; i++){
            xor ^= i;
        }
        for(int num : arr){
            xor ^= num;
        }
        System.out.println(xor);
    }
}
