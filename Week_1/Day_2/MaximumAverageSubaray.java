class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            
            if(j-i+1==k){
                sum+=nums[j];
                maxSum=Math.max(maxSum,sum);
                 j++;
            }
            else if(j-1+1<k){
                sum+=nums[j];
                j++;
            }
            else{
                while(j-i+1>k){
                    sum-=nums[i];
                    i++;
                }
            }
           

        }
        return (double) maxSum/k;
    }
}