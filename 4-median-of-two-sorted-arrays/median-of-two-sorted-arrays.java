class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int totalLength = l1 + l2;
        
        int index1 = 0, index2 = 0;
        int prev = 0, curr = 0;
        
        // We need to merge the arrays up to the midpoint of the merged array
        for (int i = 0; i <= totalLength / 2; i++) {
            prev = curr;
            
            if (index1 < l1 && (index2 >= l2 || nums1[index1] <= nums2[index2])) {
                curr = nums1[index1++];
            } else {
                curr = nums2[index2++];
            }
        }
        
        // If the total length is odd, return the middle element
        if (totalLength % 2 == 1) {
            return curr;
        }
        
        // If the total length is even, return the average of the two middle elements
        return (prev + curr) / 2.0;
        
    }
}