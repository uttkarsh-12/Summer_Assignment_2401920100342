    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int [] freq1=new int [26];
            int [] freq2=new int [26];
            for(int i=0;i<s1.length();i++){
                freq1[s1.charAt(i)-'a']++;
            }
            int l=0;
            int r=0;
            while(r<s2.length()){
                freq2[s2.charAt(r)-'a']++;
            
                while(r-l+1>s1.length()){
                    freq2[s2.charAt(l)-'a']--;
                    l++;
                }
                if(r-l+1==s1.length()){
                    if(Arrays.equals(freq1,freq2)) return true;
                }
                r++;
            }
            return false;
        }
    }