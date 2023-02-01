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
    
    public void insertlast(int value){
        // Node node = new Node(value);
        // tail.next = node;
        // node.prev = tail;
        // if(tail!=null){
        //     tail = node;
        // }
        // size +=1;
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
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
    
    public void insert(int after, int value){
        Node prev = find(after);
        
        if(prev==null){
            System.out.println("Does not exist");
            return;
        }
        
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if(node.next!=null){
            node.next.prev = node;
        }
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
        Node node = head;
        
        while (node != null){
            System.out.print(node.value + " -> ");           
            node = node.next;
        }
        System.out.println("END");
    }
    
    public void displayrev(){
        Node node = head;
        Node last = null;
        while (node != null){
            last = node;
            node = node.next;
        }
        while(last!=null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}

public class DoublyLL{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(0);
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertlast(-1);
        list.display();
        list.displayrev();
        list.insert(2, 8);
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
