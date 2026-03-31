class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        int left=0;
        int right=arr.length-1;
        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        return String.join(" ",arr);
    }
}

//StringBuilder Version 

class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;

            int end = i;

            // find start of word
            while (i >= 0 && s.charAt(i) != ' ') i--;

            String word = s.substring(i + 1, end + 1);

            if (res.length() > 0) {
                res.append(" ");
            }

            res.append(word);
        }

        return res.toString();
    }
}



//In-place solution
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Step 1: reverse entire string
        reverse(arr, 0, n - 1);

        // Step 2: reverse each word
        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        // Step 3: clean spaces
        return cleanSpaces(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private String cleanSpaces(char[] arr) {
        int i = 0, j = 0, n = arr.length;

        while (j < n) {
            while (j < n && arr[j] == ' ') j++; // skip spaces
            while (j < n && arr[j] != ' ') arr[i++] = arr[j++]; // copy word
            while (j < n && arr[j] == ' ') j++; // skip spaces
            if (j < n) arr[i++] = ' ';
        }

        return new String(arr, 0, i);
    }
}