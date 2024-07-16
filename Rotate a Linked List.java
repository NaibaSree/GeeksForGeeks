class Solution{
    void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int[] arr=new int[count];
        temp=head;
        for(int i=0;i<count;i++){
            arr[i]=temp.data;
            temp=temp.next;
        }
        k%=count;
        
        reverse(arr,0,k-1);
        reverse(arr,k,count-1);
        reverse(arr,0,count-1);
        temp=head;
        for(int i=0;i<count;i++){
            temp.data=arr[i];
            temp=temp.next;
        }
        return head;
    }
}
