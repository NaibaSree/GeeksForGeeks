class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head){
	// Your code here	
	Node temp=head;
	int count=0;
	while(temp!=null){
	    count++;
	    temp=temp.next;
	}
	temp=head;
	while(temp!=null && temp.next!=null){
	    if(temp.data==temp.next.data){
	        temp.next=temp.next.next;
	    }
	    else
	    temp=temp.next;
	}
    return head;
    }
}
