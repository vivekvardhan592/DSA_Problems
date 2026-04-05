class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set=new HashSet<>();
        for(int candy:candyType){
            if(!set.contains(candy)){
                set.add(candy);
            }
        }
        int difftype=set.size();
        if(n/2<set.size()){
            difftype=n/2;
        }
        return difftype;
        
    }
}


// Time-O(n)
// Space-O(n)