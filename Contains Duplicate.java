

class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
    }
}

// check this link https://neetcode.io/problems/duplicate-integer/question
