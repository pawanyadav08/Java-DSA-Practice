import java.util.ArrayList;
import java.util.Collection;

public class javaCollFrme {
    public static void main(String[] args) {
        //list or collection -> interfaces

        //ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

    }
}
