class Solution {
    boolean pali(Node root){
        Node temp=root;
        int count=0;
        String s="";
        while(temp!=null){
            s+=temp.data;
            temp=temp.next;
        }
        for(int i=0;i<s.length()/2;i++)
        if(s.charAt(i)!=s.charAt(s.length()-1-i))
        return false;
        return true;
    }
    public boolean compute(Node root) {
        return pali(root);
        
    }
}
