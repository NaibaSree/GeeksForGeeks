class Tree
{
    public int btcheck(Node root){
        if(root==null)
        return 0;
        int lh=btcheck(root.left);
        if(lh==-1)
        return -1;
        int rh=btcheck(root.right);
        if(rh==-1)
        return -1;
        if(Math.abs(lh-rh)>=2)
        return -1;
        return 1+Math.max(lh,rh);
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	int flag=btcheck(root);
	if(flag==-1)
	return false;
	return true;
    }
}
