class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[t.charAt(i)-'a']++;
            freq[s.charAt(i)-'a']--;
        }
        freq[t.charAt(t.length()-1)-'a']++;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}



// Time-O(n)
//Spave - O(1)




//Bit manipulation
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for(char c : s.toCharArray()) result ^= c;
        for(char c : t.toCharArray()) result ^= c;

        return result;
    }
}