class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=(len+1)*len/2;
        for(int i=0;i<len;i++){
            sum=sum-nums[i];
        }
        return sum;
    }
}