class Solution {
    //Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2)
    {
       if(root1 == null && root2 == null)
       return true;
       if((root1==null && root2!=null)|| (root2==null && root1!=null)||root1.data!=root2.data )
       return false;
       return (isIdentical(root1.left, root2.left) && isIdentical(root2.right, root1.right));
            
    }
}
