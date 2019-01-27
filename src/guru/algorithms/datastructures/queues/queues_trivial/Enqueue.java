package guru.algorithms.datastructures.queues.queues_trivial;

public class Enqueue {
    public static void main(String[] args){
        Queue queue=new Queue(5);
        System.out.println(queue.isEmpty());
        queue.enqueue(3);
        queue.enqueue(56);
        queue.enqueue(33);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());

    }
}
