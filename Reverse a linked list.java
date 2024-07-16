
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null || head.next==null)
        return head;
        Node pre=null;
        Node current=head;
        Node Next=null;
        int count=0;
        while(current!=null){
            Next=current.next;
            current.next=pre;
            pre=current;
            current=Next;
        }
        return pre;
    }
}
