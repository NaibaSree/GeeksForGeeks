class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        Node dummy=new Node(0);
        dummy.next=head;
        Node pre=dummy;
        Node temp=head;
        while(temp!=null){
            while(temp.next!=null && pre.next.data==temp.next.data)
            temp=temp.next;
            if(pre.next==temp)
            pre=pre.next;
            else
            pre.next=temp.next;
            temp=temp.next;
        }
        head=dummy.next;
        return head;
    }
}
