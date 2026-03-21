class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n2=0;
        int n1=nums1.length;
        for(int i=m;i<n1;i++){
            nums1[i]=nums2[n2];
            n2++;
        }
        for(int i=0;i<n1;i++){
            int minIndex=i;
            for(int j=i+1;j<n1;j++){
                if(nums1[j]<nums1[minIndex]){
                    minIndex=j;
                }
            }
            int temp=nums1[i];
        nums1[i]=nums1[minIndex];
        nums1[minIndex]=temp;
        }
    }
}

// Time-O((m+n)^2)
//Space-O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // last valid element in nums1
        int j = n - 1;       // last element in nums2
        int k = m + n - 1;   // last position of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining nums2 elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

// Time-O(m+n)
// Space-O(1)