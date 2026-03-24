class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxAvg=0;

        double windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        maxAvg=windowSum;
        for(int i=k;i<n;i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            maxAvg=Math.max(windowSum,maxAvg);
        }
        return maxAvg/k;
    }
}

// Time: O(n)
// Space: O(1)