class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        if(arr.length==-1)
        return -1;
        if(arr.length==1)
        return 1;
        long sum1=0,sum2=0,tsum=0;
        for(int i=0;i<arr.length;i++)
        tsum+=arr[i];
        sum2=tsum;
        for(int i=0;i<arr.length;i++){
            sum2-=arr[i];
            if(sum1==sum2)
                return i+1;
            sum1+=arr[i];
        }
       return -1; 
    }
}
