class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int res=0;
        for(int i:arr)
        res^=i;
        return res;
    }
}
