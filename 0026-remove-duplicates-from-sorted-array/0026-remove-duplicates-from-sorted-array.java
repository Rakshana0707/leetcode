class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int temp[] = new int[nums.length];

        int j;

        j = 0;

        temp[j] = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != temp[j])
            {
                j++;
                temp[j] = nums[i];
            }
        }

        for(int i=0;i<=j;i++)
        {
            nums[i] = temp[i];
        }

        return j+1;
    }
}