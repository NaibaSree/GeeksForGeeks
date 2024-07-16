class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        List<Integer> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        int l=0,r=list.size()-1;
        while(l<r){
            if(list.get(l)!=list.get(r))
            return false;
            l++;
            r--;
        }
        return true;
    }    
}

