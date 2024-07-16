class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         if(node==null)
         return 0;
         if(node.left==null && node.right==null)
         return 1;
         int lp=countLeaves(node.left);
         int rp=countLeaves(node.right);
         return lp+rp;
    }
}
