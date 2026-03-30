class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=0;
        String[] arr= s.split(" ");
        for(int i=0;i<arr.length;i++){
            char[] word = arr[i].toCharArray();
            left=0;
            right=word.length-1;
            while(left<right){
                char temp=word[left];
                word[left]=word[right];
                word[right]=temp;
                left++;
                right--;
            }
            arr[i]=new String(word);
        }
        return String.join(" ",arr);
        

    }
}

// Time-O(n)
//Spave - O(n) because of split
