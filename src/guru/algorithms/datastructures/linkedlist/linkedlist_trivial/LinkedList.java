package guru.algorithms.datastructures.linkedlist.linkedlist_trivial;

 class LinkedList {
    private Node head;

    void addLast(int data){
        Node node=new Node(data);
        //This step need not be done, default is null.
        node.next=null;
        //Checking if the head is null, if it is node we have to traverse till the last node (until null) and then add it.
        if(head==null){
            head=node;
        }
        else{
            Node traversalNode = head;
            while (traversalNode.next!=null){
                traversalNode=traversalNode.next;
            }
            traversalNode.next=node;
        }
    }

    void addAt(int index, int data){
        Node node = new Node(data);
        node.next=null;
        Node traversal = head;
        for(int i=0;i<index-1;i++){
             traversal=traversal.next;
        }
        node.next=traversal.next;
        traversal.next=node;

    }

    void addFirst(int data){
        Node node=new Node(data);
            node.next = head;
            head=node;
    }

    void deleteLast(){
        Node traversalNode=head;
        for(int i=0;i<size()-2;i++){
            traversalNode=traversalNode.next;
        }
        traversalNode.next=null;
    }

    void deleteFirst(){
        Node node=head;
        head=node.next;
    }

    void show(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print("-->"+currentNode.getData());
            currentNode=currentNode.next;
        }
    }

    int size(){
        int size=0;
        Node traverse=head;
        while(traverse!=null){
            traverse=traverse.next;
            size++;
        }
        return size;
    }
}
