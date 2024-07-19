class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Your code here
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
            max=Math.max(max,count);
            if(count<0)
            count=0;
        }
        return max;
    }
}
