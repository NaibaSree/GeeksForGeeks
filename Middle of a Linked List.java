class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==0 || count==1)
        return head.data;
        temp=head;
        for(int i=0;i<count/2;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}
