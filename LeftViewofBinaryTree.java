class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list=new ArrayList<Integer>();
      if(root==null)
      return list;
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          List<Integer> l=new LinkedList<>();
          int size=q.size();
          for(int i=0;i<size;i++){
              Node node=q.poll();
              l.add(node.data);
              if(node.left!=null)
              q.add(node.left);
              if(node.right!=null)
              q.add(node.right);
          }
          list.add(l.get(0));
      }
      return list;
    }
}
