import java.util.*;

public class javaCollFrme {
    public static void main(String[] args) {
        //list or collection -> interfaces

        //Stack -> concrete class
//        Stack<Integer> list = new Stack<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        Stack<Integer> list2 = new Stack<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println("Printing list2 :" + list2);
//        list2.clear();
//        System.out.println(list2.size());
////        List<Integer> list = new Stack<>();
////        Collection<Integer> collection = new Stack<>();
//
//        //i want to traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("Element: " + iterator.next());
//        }
//
//        Stack<Integer> list3 = new Stack<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(14);
//        System.out.println(list3.get(0));
//        System.out.println("before set: "+ list3);
//        list3.set(0,100);
//        System.out.println("after set : " + list3);
//
//        //toArray
//        Object[] arr = list3.toArray();
//        for(Object obj: arr){
//            System.out.println(obj);
//        }
//
//        //contains
//        System.out.println(list3.contains(100));
//
//        list.add(12);
//        list.add(6);
//        System.out.println("printing the entire list: "+ list);
//        //sort
//        Collections.sort(list);
//        System.out.println("Printing Entire List : " + list);
//
//        Stack<Integer> newList = new Stack<>();
//        newList.addAll(list);
//        System.out.println("Printing Entire NewList : " +newList);
//        Stack<Integer> marks = new Stack<>();
//        System.out.println(marks.isEmpty());
//        list.add(30);
//        list.add(24);
//        list.add(30);
//        System.out.println("Printing orignal List: " + list);
//        System.out.println(list.indexOf(40));
//        System.out.println(list.lastIndexOf(30));
//
//        //IndexOf
////        System.out.println(newList.indexOf(40));
//
//        //Stack operations
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        System.out.println("printing orignal list : " + list);
//        list.push(101);
//        System.out.println(list);
//        list.pop();
//
//        System.out.println(list);
//
//        Stack<Integer> ll = new Stack<>();
//        ll.add(10);
//        System.out.println(ll);
//        ll.push(1);
//        System.out.println(ll);
//        ll.push(101);
//        System.out.println(ll);
//
//        System.out.println(ll.firstElement());
//        System.out.println(ll.peek());
//        System.out.println(ll.peek());
//        System.out.println(ll);
//        System.out.println(ll.pop());
//        System.out.println(ll);




        //vector - it is like arraylist which is a resisable array
        //so it is recommended to use arraylist instead of vector
        // because it is less efficient

        //stack starts from here
        //Last In , First Out

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(11);
        System.out.println(st);

        st.push(12);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(12)); //give -1 or 1 instead of true false

        System.out.println(st.search(11)); //gives where it is found by giving index
        System.out.println(st.empty());
    }
}
