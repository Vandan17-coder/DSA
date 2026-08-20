class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            }

            //checking left half is sorted 
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1; 
                } else {
                    low = mid + 1;
                }
            }
            //checking right half is sorted
            else{
                if(target <= nums[high] && target > nums[mid]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            
        }

        return -1;
    }
}