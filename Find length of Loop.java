class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        int count=0;
         Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                count=1;
                 while(slow!=fast){
                 fast=fast.next;
                 count++;
                 }
                 break;
            }
        }
        return count;
    }
}
