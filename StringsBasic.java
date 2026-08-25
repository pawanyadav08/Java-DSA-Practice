import java.sql.SQLOutput;
import java.util.Scanner;

public class StringsBasic {
    public static void main(String[] args) {
        //empty = lenght 0
        //blank = empty or sirf space hai strimng
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the String Contents");
        String str = sc.nextLine(); //whole line
        System.out.println("Value of nextline: " + str);

        System.out.println("Provide the String Contents");
        String str2 = sc.next();//only till space
        System.out.println("Value of next: " + str2);
//        String name1 = "Love";
//        String name2 = "LOVE";
//        if(name1.equals(name2)){
//            System.out.println("Both strings are equal");
//        }else{
//            System.out.println("Both strings are not equal");
//        }

       //string = sequence of characters
//       String firstname = "Love";
//       String lastname = new String("babbar");
//        System.out.println(firstname + " " + lastname);
//        System.out.println(firstname[0]);
        // string is immutable
//        System.out.println(firstname.length());
////        System.out.println(firstname.charAt(0));
//    String name = "Rana"; // old name string is not updated it just shift to the new refrence
//    name = "Bana";
//        System.out.println(name);

    }
}
