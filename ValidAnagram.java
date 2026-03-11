class Solution {
    public boolean isAnagram(String s, String t) {
      int freq[]=new int[256];
      boolean a=true;
      for(char c:s.toCharArray()){
        freq[c]++;
      }
      for(char c:t.toCharArray()){
        freq[c]--;
      }
      for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
            a=false;
        }
      }
      return a;
    }
}
// check the link :https://neetcode.io/problems/is-anagram/question
