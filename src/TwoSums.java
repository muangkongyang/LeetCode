import java.util.Arrays;

/* 
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.
 
Example 1:
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Output: Because nums[0] + nums[1] == 9, we return [0, 1].
	
Example 2:
	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	
Example 3:
	Input: nums = [3,3], target = 6
	Output: [0,1]



@Author: Muangkong Yang
Date: 09/21/2020

*/

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) 
    {        
        int[] indeces = new int[2];
        
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    indeces[0] = i;
                    indeces[1] = j;
                }
            }
        }
            
        return indeces;
    }

	
	public static void main(String[] args)
	{
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] expected = {0, 1};
		int[] solution;
		
		System.out.println("Your input: " + Arrays.toString(nums));
		System.out.println("Target: " + target);
		
		solution = twoSum(nums, target);
		System.out.println("Output: " + Arrays.toString(solution));
		
		System.out.println("Expected: " + Arrays.toString(expected));
	}
}
