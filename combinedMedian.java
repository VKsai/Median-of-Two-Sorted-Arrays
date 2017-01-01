//import org.apache.commons.lang3.ArrayUtils;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] combined = combine(nums1, nums2);
        //int[] combined = nums1 + nums2;
        int size = combined.length;
        
        if(size % 2 == 0)
        {
            return (combined[size/2] + combined[size/2 + 1])/2;
        }
        else
        {
            int odd = (int)((size + 1)/2);
            return combined[odd];
        }
    }
    public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
        }
}
