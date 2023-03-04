import java.util.*;

class Node{
    boolean isLocked;
    Node parent;
    int id;
    int anc_locked;
    int des_locked;
    ArrayList<Node> child = new ArrayList<Node>();
}

class oppe{

    static void change(Node node, int val){
        if(node == null) {
            return;
        }
        node.anc_locked+=val;
        for(Node i:node.child){
            change(i,val);
        }
    }

    static boolean getAllChilds(Node node, List<Node> a, int id){
        if(node == null) {
            return false;
        }
        if(node.isLocked){
            if(id != node.id){
                return false;
            }
        }
        if(node.des_locked==0){
            return true;
        }
        for(Node i : node.child){
            boolean ans = getAllChilds(i, a, id);
            if(ans==false) return false;
        }
        return true;
    }

    static boolean lock(Node node, int id){
        if(node.isLocked){
            return false;
        }
        if(node.anc_locked>0 || node.des_locked>0){
            return false;
        }
        Node parent = node;
        while(parent != null){
            parent.des_locked+=1;
            parent = parent.parent;
        }
        change(node,1);
        node.isLocked = true;
        node.id=id;
        return true;
    }

    static boolean unlock(Node node, int id){
        if(!node.isLocked || node.id!=id){
            return false;
        }
        Node parent = node;
        while(parent!=null){
            parent.des_locked-=1;
            parent = parent.parent;
        }
        change(node, -1);
        node.isLocked=false;
        node.id=0;
        return true;
    }

    static boolean upgrade(Node node, int id){
        if(node.isLocked || node.anc_locked>0 || node.des_locked==0){
            return false;
        }
        ArrayList<Node> a = new ArrayList<>();
        boolean can = getAllChilds(node,a,id);
        if(!can) return false;
        change(node,1);
        for(Node i : a){
            unlock(i, id);
        }
        node.isLocked = true;
        node.id=id;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        Map<String,Node> hash = new HashMap<>();
        Node root = new Node();
        hash.put(arr[0], root);
        
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        int idx = 1;
        while(q.size()>0 && idx<n){
            int size = q.size();
            while(size-->0){
                Node rem = q.remove();
                for(int i=1;i<=k && idx<n;i++){
                    Node newNode = new Node();
                    newNode.parent = rem;
                    hash.put(arr[idx],newNode);
                    q.add(newNode);
                    rem.child.add(newNode);
                    idx++;
                }
            }
        }

        for(int i=0;i<k;i++){
            int val = sc.nextInt();
            String str = sc.next();
            int id = sc.nextInt();

            boolean ans = false;
            switch(val){
                case 1:
                    ans = lock(hash.get(str),id);
                    break;
                case 2:
                    ans = unlock(hash.get(str),id);
                    break;
                case 3:
                    ans = upgrade(hash.get(str),id);
                    break;
            } 
            System.out.println(ans);
        }
    }
}