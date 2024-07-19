class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
        if(n<=1)
        return 0;
        int jump=0,far=0,current=0;
        for(int i=0;i<n;i++){
            far=Math.max(far,arr[i]+i);
            if(i==current){
                current=far;
                jump++;
                if(far>=n-1)
                return jump;
            }
        }
        return -1;
    }
}
