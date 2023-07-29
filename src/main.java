import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> cola= new PriorityQueue<>((c1,c2)->{
            return -1*(c1-c2);
        });
        cola.offer(2);
        cola.offer(10);
        cola.offer(5);
        cola.offer(12);
        cola.offer(7);
        System.out.println(cola.peek());

    }
}
