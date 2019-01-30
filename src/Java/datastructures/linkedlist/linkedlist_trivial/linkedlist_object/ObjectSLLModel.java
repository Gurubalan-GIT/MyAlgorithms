package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_object;

public class ObjectSLLModel {
    private String name;
    private int registerNumber;

    public ObjectSLLModel(String name, int registerNumber) {
        this.name = name;
        this.registerNumber = registerNumber;
    }

    String toResult(){
        return "Name- "+name+" Register Number- "+registerNumber;
    }
}
