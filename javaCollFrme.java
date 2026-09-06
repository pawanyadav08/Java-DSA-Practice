import java.util.*;

public class javaCollFrme {
    public static void main(String[] args) {
        //list or collection -> interfaces

        //LinkedList -> concrete class
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Printing list2 :" + list2);
        list2.clear();
        System.out.println(list2.size());
//        List<Integer> list = new LinkedList<>();
//        Collection<Integer> collection = new LinkedList<>();

        //i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(0));
        System.out.println("before set: "+ list3);
        list3.set(0,100);
        System.out.println("after set : " + list3);

        //toArray
        Object[] arr = list3.toArray();
        for(Object obj: arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(100));

        list.add(12);
        list.add(6);
        System.out.println("printing the entire list: "+ list);
        //sort
        Collections.sort(list);
        System.out.println("Printing Entire List : " + list);

        LinkedList<Integer> newList = new LinkedList<>(list);
        System.out.println("Printing Entire NewList : " +newList);
        LinkedList<Integer> marks = new LinkedList<>();
        System.out.println(marks.isEmpty());

        //IndexOf
//        System.out.println(newList.indexOf(40));





    }
}
