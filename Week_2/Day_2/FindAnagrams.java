class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        int l=0;
        int r=0;
        while(r<s.length()){
            freq2[s.charAt(r)-'a']++;
            while(r-l+1>p.length()){
                freq2[s.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==p.length()){
                if(Arrays.equals(freq1,freq2)){
                    res.add(l);
                }
            }
            r++;
        }
        return res;
    }
}