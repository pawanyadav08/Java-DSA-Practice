import java.util.Scanner;

public class StringPractice {
    static void printString(String str){
        int n = str.length();
        for(int i = 0; i < n ; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLenghtOfString(String str){
       char[] arr = str.toCharArray();
       int len = arr.length;
       return len;
    }

    static int getVowelCount(String str){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;


            }
        }
        return count;

    }

    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i = n-1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    static boolean isPalindrome(String str){
        String orignal = str;
        String reverse = reverseString(orignal);
        for(int i = 0 ; i < orignal.length() ; i++){
            char ch1 = orignal.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1 != ch2){
                return false;
                }
            }
        return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
//        printString(str);
//        getLenghtOfString(str);
//        System.out.println(getLenghtOfString(str));
//        getVowelCount(str);

    }
}
