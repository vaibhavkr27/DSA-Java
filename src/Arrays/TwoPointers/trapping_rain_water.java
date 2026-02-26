package Arrays.TwoPointers;

public class trapping_rain_water {class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int answ=0;
        int lmax=0;
        int rmax=0;

        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                answ+=lmax-height[l];
                l++;
            }
            else{
                answ+=rmax-height[r];
                r--;
            }
        }
        return answ;
    }
}

}
