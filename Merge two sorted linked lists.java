class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node node=new Node(-1);
     Node temp=node;
     Node th1=head1;
     Node th2=head2;
     if(head1==null)
     return head2;
     if(head2==null)
     return head1;
     while(th1!=null && th2!=null){
         if(th1.data<th2.data){
         temp.next=th1;
         temp=th1;
         th1=th1.next;
         }
         else{
             temp.next=th2;
             temp=th2;
             th2=th2.next;
         }
     }
     while(th1!=null){
         temp.next=th1;
         temp=th1;
         th1=th1.next;
     }
     while(th2!=null){
         temp.next=th2;
         temp=th2;
         th2=th2.next;
     }
     Node nnode=node.next;
     return nnode;
   } 
}
