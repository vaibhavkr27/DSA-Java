package Arrays.TwoPointers;

public class SortColors {
    class Solution {
        public void sortColors(int[] nums) {

            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while(mid<=high){
                if(nums[mid]==0){
                    swap(nums,low,mid);
                    mid++;
                    low++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else if(nums[mid]==2){
                    swap(nums,mid,high);
                    high--;
                }

            }

        }
        private void swap(int num[],int i,int j){
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
        }
    }

}
