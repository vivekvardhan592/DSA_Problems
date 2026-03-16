class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                
                int i=mid;
                int j=mid;
                while(i>=0 && nums[i]==target){
                    i--;
                }
                while(j<nums.length && nums[j]==target){
                    j++;
                }
                arr[0]=i+1;
                arr[1]=j-1;
                return arr;
            }

            if(nums[mid]<target){
                left=mid+1;
            }else
            {
                right=mid-1;
            }
        }
        return arr;
    }
}


// Time-O(n)
// Space-O(1)


class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1; // move left
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1; // move right
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

// Time-O(logn)
// Space-O(1)
