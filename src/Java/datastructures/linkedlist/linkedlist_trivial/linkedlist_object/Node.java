package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_object;

class Node {
    ObjectSLLModel objectSLLModel;
    Node next;
    Node(ObjectSLLModel object) {
        this.objectSLLModel = object;
    }

    ObjectSLLModel getData() {
        return objectSLLModel;
    }
}
