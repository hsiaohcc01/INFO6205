class Solution {
    public void rotate(int[] nums, int k) {
        k= k % nums.length;
        rotation(nums,0,nums.length-1-k);
        rotation(nums,nums.length-k,nums.length-1);
        rotation(nums,0,nums.length-1);
    }
    public static void rotation(int[] nums,int low,int high){
        while(low < high){
            int temp = nums[low];
            nums[low++] = nums[high];
            nums[high--] = temp;
        }
    }
}
