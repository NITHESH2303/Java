class LL{
    private Node head;
    private Node tail;
    private int size;
    
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        
        public Node(int value) {
            this.value = value;
        }
        
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    
    public LL(){
        this.size = 0;
    }
    
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        if (tail==null){
            tail = head;
        }
        size +=1;
    }
    
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public Node get(int index){
        Node node = head;
        for(int i=0; i< index;i++){
            node = node.next;
        }
        return node;
    }
    
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    
    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }
    
    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("HEAD");
        }
    }
}

public class CircularLL{
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(-1);
        list.display();
        list.delete(-1);
        list.display();
        // System.out.println(list.deletefirst());
        // list.display();
        // System.out.println(list.deletelast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();
        // System.out.println(list.find(1));
    }
}
