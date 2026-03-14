class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] expected=heights.clone();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(expected[j]<expected[j-1]){
                    int temp=expected[j];
                    expected[j]=expected[j-1];
                    expected[j-1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}

// Time Complexity - O(n^2)
//Space Complexity -O(n)


/*Optimized Version */

class Optimal {
    public int heightChecker(int[] heights) {
        
        int[] count = new int[101];

        // count frequencies
        for(int h : heights){
            count[h]++;
        }

        int index = 0;
        int mismatch = 0;

        // build sorted order
        for(int h = 1; h <= 100; h++){
            while(count[h] > 0){
                if(heights[index] != h){
                    mismatch++;
                }
                index++;
                count[h]--;
            }
        }

        return mismatch;
    }
}

//Time -O(n)
//Space - O(1)
