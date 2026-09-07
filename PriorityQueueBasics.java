import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //Interger -< less value -> more priority -> minheap
        //for maxHeap write (a,b)->b-a after creating priorityqueue for integer
        //pq -> strings -> comparator write by yourself
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
