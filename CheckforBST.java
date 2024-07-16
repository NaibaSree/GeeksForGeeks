class Solution {
    // Function to check whether a Binary Tree is BST or not.
    public void inOrder(Node root,List<Integer> list){
        if(root==null)
        return;
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }
    boolean isBST(Node root) {
        // code here.
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1))
            return false;
        }
        return true;
    }
}
