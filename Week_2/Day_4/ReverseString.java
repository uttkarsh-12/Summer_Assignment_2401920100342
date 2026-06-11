class Solution {
    public String reverseWords(String s) {
        char[] res = s.toCharArray();
        int start = 0;
        
        for (int end = 0; end <res.length; end++) {
            if (res[end] == ' ' || end == res.length - 1) {
                int left = start;
                int right = (res[end] == ' ') ? end - 1 : end;
                while (left < right) {
                    char temp = res[left];
                    res[left] = res[right];
                    res[right] = temp;
                    left++;
                    right--;
                }
            start = end + 1;
            }
        }
        return new String(res);
    }
}
