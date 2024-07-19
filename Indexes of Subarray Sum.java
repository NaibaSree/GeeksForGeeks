class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0,i=0,j=0;
        while(i<n){
            sum+=arr[i];
            while(sum>s && j<i){
                sum-=arr[j];
                j++;
            }
            if(sum==s){
                list.add(j+1);
                list.add(i+1);
                return list;
            }
            i++;
        }
        list.add(-1);
        return list;
    }
}
