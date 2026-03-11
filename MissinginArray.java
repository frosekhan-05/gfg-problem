class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        int freq[]=new int[n+1];
        for(int i:arr){
            freq[i]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                return i;
            }
        }
        return -1;
    }
}//
// check the link here:https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Java&sortBy=submissions
