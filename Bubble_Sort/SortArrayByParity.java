class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int n=nums.length;
      for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
            if(nums[j]%2==0){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
        }
      }  
      return nums;
    }
}


//Time-O(n^2)
//Space-O(1)


class Optimal {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right){

            if(nums[left] % 2 > nums[right] % 2){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if(nums[left] % 2 == 0) left++;
            if(nums[right] % 2 == 1) right--;
        }

        return nums;
    }
}

// Time -O(n)
//Space - O(1)