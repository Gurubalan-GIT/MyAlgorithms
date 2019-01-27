package guru.algorithms.datastructures.queues.queues_trivial.queue_arrays.queue_object;

public class ObjectQueueExecute {
    public static void main(String[] args){
        int size;
        System.out.println("Enter the size of the queue-");
        size=ObjectQueue.scanner.nextInt();
        ObjectQueue objectQueue=new ObjectQueue(size);
        System.out.println("Enter the name and the Register number- ");
        ObjectQueueModel objectQueueModel=new ObjectQueueModel("reeg",243);
        objectQueue.enqueue(objectQueueModel);
        objectQueue.enqueue(objectQueueModel);
        objectQueue.show();
    }
}
