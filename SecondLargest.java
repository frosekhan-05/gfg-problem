class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max&&arr[i]>max2){
                max2=arr[i];
            }
        }  if(max2 == Integer.MIN_VALUE){
            return -1;
        }

        return max2;
    }
}// check the link here:https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays,Java&sortBy=submissions
