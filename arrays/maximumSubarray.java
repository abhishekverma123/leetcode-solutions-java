/* Problem : Leetcode 53 Maximum SubArray
Platform : Leetcode  
Approach : Use KADANE Algorithm  -> I Like You 
   Maintain a current sum (currentSum)
- Add each element to currentSum
- If currentSum becomes negative, reset it to 0
- Track the maximum sum found so far
  
  Example :  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  
Time Complexity : O(n)
Space Complexity : O(1)  
  */
  
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



class Solution {
    public int maxSubArray(int[] nums) {

      int cs = 0;
      int maxSum = nums[0];
      int i = 0;
      while(i < nums.length){
        cs = cs + nums[i];
        if(cs > maxSum){
            maxSum = cs;
        }
        if(cs < 0){
            cs = 0;
        }
        i++;
      }
      return maxSum;
    }
}

