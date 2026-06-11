class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<String>();
        int open=0;
        int close=0;
        solve(res,n,open,close,new StringBuilder());
        return res;
    }
    public void solve(List<String>res,int n,int open,int close,StringBuilder curr){
        if(curr.length()==2*n){
            res.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append("(");
            solve(res,n,open+1,close,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
            solve(res,n,open,close+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}