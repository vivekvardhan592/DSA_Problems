class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int n = citations.length;
        int high = citations.length-1;
        int Hindex=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(citations[mid]<(n-mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        Hindex=n-low;
        return Hindex;
    }
}


// Time-O(logn)
// Space-O(1)