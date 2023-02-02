public class Exam{

public class Node{
    int data;
    Node next;
    public Node(int  data){
        this.data = data;
        this.next = null;
    }

}
public Node head=null;

public void addNode(int data){

Node newNode = new Node(data);
if(head==null){
    head = newNode;

}
else{
    newNode.next = head;
}

}
public void insertion_at_end(){}
public static void main(String[] args){

Exam test = new Exam();
test.addNode(1);
test.addNode(1);
test.addNode(1);
test.addNode(1);

}


}