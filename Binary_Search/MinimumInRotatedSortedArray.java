class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
        int mid = low + (high-low)/2;
        if(nums[mid]<min){
            min=nums[mid];
            high=mid-1;
        }else{
            low=mid+1;
        }
        }
        return min;
    }
}


//Apporach: compares with a changing min, which may skip the correct half.

//Time-O(log n)
//Space-O(1)


class Optimal {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum is in right half
                low = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                high = mid;
            }
        }

        return nums[low];
    }
}

// Time: O(log n)
// Space: O(1)

//Approach - compares with nums[high] to always discard the wrong half, guaranteeing correctness.