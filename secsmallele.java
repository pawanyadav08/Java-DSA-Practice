import java.util.*;
public class secsmallele{
    public static void main(String[] args) {
      int[] arr = {4,2,7,1,3};
      
      int smallest = Integer.MAX_VALUE;
      int second = Integer.MAX_VALUE;

      for(int num:arr){
        if(num < smallest){
            second = smallest;
            smallest = num;
        }else if (num>smallest && num < smallest){
            second = num;
        }
      }
      System.out.println("Second Smallest: "+second);
    }
}