class Solution {
    int[] constructLowerArray(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            int ele=arr[i];
            for(int j=i+1;j<n;j++){
                if(ele>arr[j])
                count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}
