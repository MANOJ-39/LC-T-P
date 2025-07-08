class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  //2,           1   
        int j = n - 1;  //2         1      0
        int k = m + n - 1;//5,      4  3   2 
        while (j>=0) {
            if (i>=0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
                //2. k=4,i=1....4pos=2
               
            } else {
                nums1[k--] = nums2[j--];
                 //1. k=5,j=2....6pos=6
                 //3. k=3,j=1....3pos=5
                 //4. k=2,j=0....2pos=3

            }
        }
       
    }
}
