package Java.datastructures.queues.queues_trivial.queue_arrays.queue_object;

 class ObjectQueueModel {
    private String name;
    private int registerNumber;

     ObjectQueueModel(String name, int registerNumber) {
        this.name = name;
        this.registerNumber = registerNumber;
    }

    String toResult(){
        return "Name- "+name+" Register Number- "+registerNumber;
    }
}
