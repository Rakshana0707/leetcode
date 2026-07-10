class Solution
{
    public int[] rearrangeArray(int[] nums)
    {
        int n;

        n = nums.length;

        int positive[] = new int[n / 2];
        int negative[] = new int[n / 2];
        int ans[] = new int[n];

        int p;
        int q;

        p = 0;
        q = 0;

        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
            {
                positive[p] = nums[i];
                p++;
            }
            else
            {
                negative[q] = nums[i];
                q++;
            }
        }

        p = 0;
        q = 0;

        for(int i=0;i<n;i=i+2)
        {
            ans[i] = positive[p];
            ans[i+1] = negative[q];

            p++;
            q++;
        }

        return ans;
    }
}