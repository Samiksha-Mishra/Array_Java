class Solution {
    public static int largest(int[] arr) {
        int max_val = arr[0];
        for(int val: arr){
            if(val>max_val) max_val = val;
        }
        return max_val;
    }
}
