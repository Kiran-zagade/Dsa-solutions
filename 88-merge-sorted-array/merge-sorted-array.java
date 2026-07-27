class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int back=m+n-1;
       
       while(right>=0)
        if(left >=0 && nums1[left]>nums2[right] ){
            nums1[back]=nums1[left];
            left--;
            back--;

        }else{
            nums1[back]=nums2[right];
            back--;
            right--;
        }
    }
}