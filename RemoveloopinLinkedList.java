class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
       if(head==null)
       return;
       Node slow=head;
       Node fast=head;
       boolean flag=false;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               flag=true;
               break;
           }
       }
       if(flag==false)
       return;
       slow=head;
       if(fast!=head){
           while(slow.next!=fast.next){
               slow=slow.next;
               fast=fast.next;
           }
           fast.next=null;
       }
       else{
       while(fast.next!=slow)
       {
           fast=fast.next;
       }
       fast.next=null;
       }
    }
}
