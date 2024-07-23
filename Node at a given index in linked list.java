class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(index>count || index<=0)
        return -1;
        temp=head;
        while(index>1){
            temp=temp.next;
            index--;
        }
        return temp.data;
    }
}
