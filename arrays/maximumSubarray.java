Problem : Leetcode 53 Maximum SubArray
Platform : Leetcode  
Approach : Use KADANE Algorithm
Time Complexity : o(n)
Space Complexity : o(1)  
  
Code :

  class Solution {
    public int maxSubArray(int[] nums) {
      int max = Integer.MIN_VALUE, cs = 0;
      for(int i=0;i<nums.length;i++){
        cs = cs + nums[i];
        if(cs > max){
            max = cs;
        }
        if(cs < 0){
            cs = 0;
        }
      }
      return max;

        
    }
}


  
