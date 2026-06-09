class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int left=0;
        int right=0;
        int maxL=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
             while (mpp.get(ch) > 1) {
                char leftChar = s.charAt(left);
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                left++;
            }
            maxL=Math.max(maxL,right-left+1);
            right++;

          
        }
        return maxL;
    }
}