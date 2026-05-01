/* Problem : Leetcode 189 Rotate Array
Platform : Leetcode
Approach : 
  First Reverse the array 
  then reverse from 0 to k-1
  then again reverse from k to length - 1

Example:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

  Time complexity : O(n)
  Space Complexity : O(1)
*/
code : 

class Solution {
    public static void helper(int arr[], int left, int right){
        int temp = 0;
        while(left < right){
           temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
        }
    }
    public void rotate(int[] nums, int k) {
            k = k % nums.length;     // ensures we don't do unnecessary full rotations
        helper(nums, 0, nums.length-1);
        helper(nums, 0, k-1);
        helper(nums,k, nums.length-1);
        }
    }

