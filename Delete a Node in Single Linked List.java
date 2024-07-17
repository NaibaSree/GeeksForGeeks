class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	   Node temp=head;
	   int count=0;
	   if(x<=1){
	       head=head.next;
	       return head;
	   }
	   while(temp!=null){
	       count++;
	       temp=temp.next;
	   }
	   Node slow=head;
	   Node fast=head;
	   if(x>=count){
	       for(int i=1;i<count;i++){
	           slow=fast;
	           fast=fast.next;
	       }
	       slow.next=fast.next;
	       return head;
	   }
	   slow=head;
	   fast=head;
	   if(x>1 && x<count){
	       for(int i=1;i<x;i++){
	           slow=fast;
	           fast=fast.next;
	       }
	       slow.next=fast.next;
	       return head;
	   }
	return head;
    }
}
