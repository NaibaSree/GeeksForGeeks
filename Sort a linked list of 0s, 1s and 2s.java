class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node temp=head;
        List<Integer> list=new ArrayList<>();
        int count=0;
        while(temp!=null){
            count++;
            list.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        Collections.sort(list);
        for(int i=0;i<count;i++){
            temp.data=list.get(i);
            temp=temp.next;
        }
        return head;
    }
}
