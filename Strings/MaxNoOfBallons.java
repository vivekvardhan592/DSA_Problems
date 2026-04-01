class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        String name = "balloon";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(name.indexOf(ch)!=-1){
                freq[text.charAt(i)-'a']++;
            }
        }
        return Math.min(
    Math.min(freq['b' - 'a'], freq['a' - 'a']),
    Math.min(
        freq['n' - 'a'],
        Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2)
    )
);
    }
}


// Time-O(n)
//Space-O(1)