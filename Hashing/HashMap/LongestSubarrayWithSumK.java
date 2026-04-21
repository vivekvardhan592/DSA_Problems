// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int sum=0;
       int len=0;
       int maxlen=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           
           if(sum==k){
               maxlen=i+1;
           }
           if(map.containsKey(sum-k)){
               len=i-map.get(sum-k);
               maxlen=Math.max(len, maxlen);
           }
           if(!map.containsKey(sum)){
               map.put(sum,i);
           }
       }
       return maxlen;
    }
    
}