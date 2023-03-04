/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Main {
    static HashMap<String,Node> map;
    static class Node{
        boolean islocked;
        Node parent;
        int id;
        int des;
        int asc;
        List<Node> child = new ArrayList<>();
    }
    static void traverse(Node node, int id){
        if(node==null) return;
        node.asc+=id;
        for(Node i: node.child){
            traverse(i,id);
        }
    }
    static boolean getAllChildNode(Node node, List<Node> child,int id){
        if(node==null) return true;
        if(node.des==0) return false;
        if(node.islocked){
            if(node.id!=id) return false;
            else child.add(node);
        }
        for(Node i: node.child){
            boolean ans = getAllChildNode(i,child,id);
            if(ans==false) return false;
        }
        return true;
    }
    static boolean lock(String s, int id){
        Node node = map.get(s);
        if(node.islocked) return false;
        if(node.des!=0 || node.asc!=0) return false;
        Node cur = node;
        while(cur!=null){
            cur.des++;
            cur = cur.parent;
        }
        traverse(node,1);
        node.islocked=true;
        node.id=id;
        return true;
    }
    static boolean unlock(Node node, int id){
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
        Node node = map.get(s);
        if(node.islocked || node.asc!=0 || node.des==0) return false;
        List<Node> sub = new ArrayList<>();
        boolean find = getAllChildNode(node,sub,id);
        if(!find) return false;
        traverse(node,1);
        for(Node i:sub){
            unlock(i,id);
        }
        node.islocked=true;
        node.id=id;
        return true;
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        String[] arr = new String[n];
        ArrayList<ArrayList<String>> queriesLst = new ArrayList<>();
        
        for(int i=0; i<n; i++)
            arr[i] = sc.next();
            
        for(int i=0; i<k; i++) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(Integer.toString(sc.nextInt()));
            temp.add(sc.next());
            temp.add(Integer.toString(sc.nextInt()));
            queriesLst.add(temp);
        }
        map = new HashMap<>();
        Node root = new Node();
		map.put(arr[0] , root);
		Queue<Node> que = new java.util.LinkedList<>();
		que.add(root);
		
		int index = 1;
		while(que.size()>0 && index < n){
			int size = que.size();
			while(size-- > 0){
				Node rem = que.remove();
				for(int i=1; i<=m && index<n ; i++){
					Node newNode = new Node();
					newNode.parent = rem;   
					map.put(arr[index] , newNode);
					rem.child.add(newNode);
					que.add(newNode);
					index+=1;
				}
			}
		}
        ArrayList<Boolean> res = new ArrayList<>();
        
        for(ArrayList<String> query : queriesLst) {
            String op = query.get(0);
            String data = query.get(1);
            int uid = Integer.parseInt(query.get(2));
            
            switch(op) {
                case "1":
                    res.add(lock(data, uid));
                    break;
                case "2":
                    res.add(unlock(map.get(data), uid));
                    break;
                case "3":
                    res.add(upgrade(data, uid));
                    break;
            }
        }
        
        System.out.println(res);
    }
}
