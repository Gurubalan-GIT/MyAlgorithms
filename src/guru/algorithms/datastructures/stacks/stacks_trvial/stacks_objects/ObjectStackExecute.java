package guru.algorithms.datastructures.stacks.stacks_trvial.stacks_objects;

public class ObjectStackExecute {
    public static void main(String[] args){
        ObjectStackModel objectStackModel = new ObjectStackModel("Gurubalan",12112);
        ObjectStack objectStack=new ObjectStack();
        objectStack.push(objectStackModel);
        objectStack.popAll();
    }
}
