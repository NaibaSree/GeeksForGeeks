class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int c1=0,c2=0;
         Node temp1=head1;
         Node temp2=head2;
         while(temp1!=null){
             c1++;
             temp1=temp1.next;
         }
         while(temp2!=null){
             c2++;
             temp2=temp2.next;
         }
         Node temp;
         Node root;
         int diff;
         if(c1>c2){
             temp=head1;
             root=head2;
             diff=c1-c2;
         }
         else{
             temp=head2;
             root=head1;
             diff=c2-c1;
         }
         while(diff>0){
             temp=temp.next;
             diff--;
         }
         while(temp!=null){
             if(temp==root)
             return temp.data;
             temp=temp.next;
             root=root.next;
         }
         return -1;
	}
}
