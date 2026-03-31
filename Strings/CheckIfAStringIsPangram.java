class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();
        int[] freq = new int[26];
        for(int i=0;i<sentence.length();i++){
            freq[arr[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;
    }
}

// Time-O(n)
//Spave - O(1)