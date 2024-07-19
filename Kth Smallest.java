class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        while(k>0){
            l++;
            k--;
        }
        return arr[l-1];
    } 
}
