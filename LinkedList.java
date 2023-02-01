
class LL{
    private Node head;
    private Node tail;
    private int size;
    
    private class Node{
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
        }
        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    public LL(){
        this.size = 0;
    }
    
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size +=1;
    }
    
    public void insertlast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size +=1;
    }
    
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node second_last = get(size - 2);
        int val = tail.value;
        tail = second_last;
        tail.next = null;
        return val;
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
    
    public void insert(int value, int index){
        if(index == 0){
            insertfirst(value);
            return;
        }
        if(index == size){
            insertlast(value);
            return;
        }
        Node temp = head;
        for(int i =1; i< index ; i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
    }
    
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return val;
    }
    
    public int delete(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class LinkedList{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(0);
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertlast(-1);
        list.display();
        list.insert(23, 3);
        list.display();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.deletelast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(1));
    }
}
