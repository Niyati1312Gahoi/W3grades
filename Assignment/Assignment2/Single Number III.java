class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int diff=xor&-xor;
        int d1=0, d2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&diff)>0){
                d1^=nums[i];
            }else{
                d2^=nums[i];
            }
        }
        int[] ans={d1,d2};
        return ans;
        
        

      

        
    }
}
