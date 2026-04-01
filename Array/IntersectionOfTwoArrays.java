class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq=new int[1001];

        for(int num : nums1){
            freq[num]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for(int num:nums2){
            if(freq[num]>0){
                ans.add(num);
                freq[num]=0;
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}

// Time-O(m+n)
// Space-O(min(n,m))