class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0, count = 0;

        for(int num : nums){
            if(num == 1){
                maxLen = Math.max(maxLen, ++count);
            } else {
                count = 0;
            }
        }
        return maxLen;
    }
}
