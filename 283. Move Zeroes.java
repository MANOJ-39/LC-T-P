class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int temp=0;
        int j=0;
        for(int i=0;i<l;i++){
            
                if(nums[i]!=0){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
            
          
        }
    }
}
