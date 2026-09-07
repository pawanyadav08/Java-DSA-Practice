import java.util.LinkedList;
import java.util.Queue;

public class javacollfrm2 {
    public static void main(String[] args) {
        //Java Queue Interface
        //push from back and pop from front
        //Queuw Basics Starts
        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
        q.offer(10);
        q.offer(20);
        q.offer(30);//add generally not use because if error we have to do exception handling
        // so instead we use offer() same for peek() instead of element() and poll() instead of removce()
        System.out.println(q);

        System.out.println("Removing " + q.poll());
        System.out.println(q);
        System.out.println("Peeking : " + q.peek());
    }
}
