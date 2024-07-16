class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(k>count)
        return -1;
        Node th=head;
        int pos=count-k;
        for(int i=0;i<pos;i++){
            th=th.next;
        }
        return th.data;
    }
}
