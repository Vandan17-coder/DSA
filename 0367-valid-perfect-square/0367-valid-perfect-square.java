class Solution {
    public boolean isPerfectSquare(int num) {
        int high = num;
        int low = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if((long)mid*mid == num){
                return true;
            }
            else if((long)mid*mid < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}