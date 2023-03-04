import java.util.*;


public class MorrisTraversal {

//    In-order Morris Traversal:
//    🌳 1st case: if left is null, print current node and go right
//    🌳 2nd case: before going left, make right most node on left subtree connected to current node, then go left
//    🌳 3rd case: if thread is already pointed to current node, then remove the thread

    public List<Integer> InorderTraversal(TreeNode root){
        var list = new ArrayList<Integer>();
        TreeNode cur = root;
        while(cur != null){
            if(cur.left == null){
                list.add(cur.val);
                cur = cur.right;
            }
            else{
                TreeNode prev = cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev = prev.right;
                }
                if(prev.right==null){
                    prev.right=cur;
                    cur = cur.left;
                }
                else{
                    prev.right=null;
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
        }return list;
    }
    //PreOrder Morris Traversal
    public List<Integer> PreOrderTraversal(TreeNode root){
        var list = new ArrayList<Integer>();
        TreeNode cur = root;
        while(cur!=null){
            if(cur.left==null){
                list.add(cur.val);
                cur = cur.right;
            }
            else{
                TreeNode prev = cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev = prev.right;
                } 
                if(prev.right==null){
                    prev.right=cur;
                    list.add(cur.val);
                    cur=cur.left;
                }
                else{
                    prev.right=null;
                    cur = cur.right; 
                }
            }
        }return list;
    }
    public static void main(String[] args) {
        
    }
}
