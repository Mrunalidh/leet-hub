class Solution {
    public int majorityElement(int[] nums) {
        int i=0,j=0,count=0;
        int n=nums.length/2;
        for(i=0;i<nums.length;i++)
        {
            count=0;
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                count++;
            }
            if(count>n)
            return nums[i];
        }
        return 0;
    }
}