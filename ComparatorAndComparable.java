import java.util.*;

public class ComparatorAndComparable {
    public static void main(String[] args) {

        Integer[] arr = {5,1,7,2,8,4};
        Arrays.sort(arr,new reverseComparator());
        for(int a: arr ){
            System.out.println(a + " ");
        }

//        List<Stu> stu = new ArrayList<>();
//        stu.add(new Stu(19 , 68,"Vipul"));
//        stu.add(new Stu(23 , 87,"Love"));
//        stu.add(new Stu(23 , 55,"Ankit"));
//        stu.add(new Stu(7 , 13,"Billu"));
//        System.out.println(stu);
//
////        Collections.sort(stu); this is for comparable interface
//        Collections.sort(stu , new WeightComparator()); //this is for comparator interface
//
//        System.out.println(stu);
//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
    }
}
