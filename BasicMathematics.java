public class BasicMathematics {
    static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    static int countDigits(int num){
        int count= 0;
        while(num != 0){
            int digit = num % 10;
            count++;
            num = num / 10;

        }
        return count;
    }
    static void printDigits(int num){
        while (num!= 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    static int reverseNum(int num){
        int revNum = 0;
        while (num != 0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }
    static boolean palindromeNum(int num){
        int orignal = num;
        int reverse = reverseNum(num);
        if(orignal == reverse){
            System.out.println("It is a Palindrome");
            return true;
        }else {
            System.out.println("It is not a Palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
          boolean ans = palindromeNum(12344321);
        System.out.println(ans);
        //int num = 1234;
//        palindromeNum(num);
//        int revNum = reverseNum(num);
//        System.out.println(revNum);
        //print digits of a number
//        int num = 53127;
//        int add = sumOfDigits(num);
//        System.out.println(add);
//        printDigits(num);
//        int ans = countDigits(num);
//        System.out.println(ans);

    }
}
