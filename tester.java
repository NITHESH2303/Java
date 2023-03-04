/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static HashMap<String,Node> map;
    static class Node{
        boolean islocked;
        Node parent;
        int asc;
        int des;
        int id;
        List<Node> child = new ArrayList<>();
    }
    static void traverse(Node node, int val){
        if(node==null) return;
        node.asc+=val;
        for(Node i:node.child){
            traverse(i,val);
        }
    }
    static boolean getAllChildNode(Node node, List<Node>subtree, int id){
        if(node==null || node.des==0) return true;
        if(node.islocked){
            if(node.id!=id) return false;
            else subtree.add(node);
        }
        for(Node i:node.child){
            boolean result = getAllChildNode(i,subtree,id);
            if(!result) return false;
        }
        return true;
    }
    static boolean lock(String s, int id){
        Node node = map.get(s);
        if(node.islocked) return false;
        if(node.asc !=0 || node.des!=0) return false;
        Node cur = node;
        while(cur!=null){
            cur.des++;
            cur=cur.parent;
        }
        traverse(node,1);
        node.islocked=true;
        node.id=id;
        return true;
    }
    static boolean unlock(Node node,int id){
        if(!node.islocked || node.id!=id) return false;
        Node cur = node;
        while(cur!=null){
            cur.des--;
            cur=cur.parent;
        }
        traverse(node,-1);
        node.islocked=false;
        node.id=0;
        return true;
    }
    static boolean upgrade(String s, int id){
        Node node=map.get(s);
        if(node.islocked || node.asc!=0 || node.des==0) return false;
        List<Node> subtree = new ArrayList<>();
        boolean find = getAllChildNode(node,subtree,id);
        if(!find) return false;
        traverse(node,1);
        for(Node i:subtree){
            unlock(i,id);
        }
        node.islocked=true;
        node.id=id;
        return true;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        List<List<String>> ql = new ArrayList<>();
        for(int i=0;i<k;i++){
            List<String> temp = new ArrayList<>();
            temp.add(Integer.toString(sc.nextInt()));
            temp.add(sc.next());
            temp.add(Integer.toString(sc.nextInt()));
            ql.add(temp);
        }
        map = new HashMap<>();
        Queue<Node> q = new java.util.LinkedList<>();
        Node node = new Node();
        
        q.add(node);
        map.put(str[0],node);
        int idx=1;
        while(q.size()>0 && idx<n){
            int size=q.size();
            while(size-->0){
                Node temp = q.poll();
                for(int i=1;i<=m && idx<n;i++){
                    Node sub = new Node();
                    sub.parent = temp;
                    temp.child.add(sub);
                    q.add(sub);
                    map.put(str[idx],sub);
                    idx++;
                }
            }
        }
        List<Boolean> out = new ArrayList<>();
        for(List<String> qr : ql){
            String val = qr.get(0);
            String s = qr.get(1);
            int id = Integer.parseInt(qr.get(2));
            switch(val){
                case "1":
                    out.add(lock(s,id));
                case "2":
                    out.add(unlock(map.get(s),id));
                case "3":
                    out.add(upgrade(s,id));
            }
        }
        for(Boolean b : out) System.out.println(b);
    }
}
