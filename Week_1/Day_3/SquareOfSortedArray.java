class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res=new int[nums.length];
        int k=nums.length-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                res[k]=nums[i]*nums[i];
                i++;
                k--;
            }
            else if(nums[j]*nums[j]>nums[i]*nums[i]){
                res[k]=nums[j]*nums[j];
                j--;
                k--;
            }
            else{
                res[k]=nums[i]*nums[i];
                i++;
                k--;
            }
        }
        return res;
    }
}