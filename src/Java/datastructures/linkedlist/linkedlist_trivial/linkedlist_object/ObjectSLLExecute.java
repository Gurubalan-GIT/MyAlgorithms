package Java.datastructures.linkedlist.linkedlist_trivial.linkedlist_object;

public class ObjectSLLExecute {
    public static void main(String[] args){
        ObjectSLL objectSLL=new ObjectSLL();
        ObjectSLLModel objectSLLModel=new ObjectSLLModel("Gururur",3425);
        ObjectSLLModel objectSLLModel1=new ObjectSLLModel("Gudrurur",3425);
        objectSLL.addLast(objectSLLModel);
        objectSLL.addLast(objectSLLModel1);
        objectSLL.show();
    }
}
