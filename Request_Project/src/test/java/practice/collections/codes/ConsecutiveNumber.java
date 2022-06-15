package practice.collections.codes;

public class ConsecutiveNumber {
	/*
	Given a binary array, find the maximum number of consecutive 1s in this array.
	Example 1:
	Input: {2, 3, 4, 1, 1, 5, 6, 1, 1, 1, 0, 1, 1, 1, 1, 2, 1};
	Output: 4 - >  
	Explanation: 
	The first two digits or the last three digits are consecutive 1s.
	The maximum number of consecutive 1s is 4.
	Note:
    1. The input array will only contain 0 and 1.
    2. The length of input array is a positive integer and will not exceed 10,000
	*/
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                ans = Math.max(ans, ++count);
            } else {
                count = 0;
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
    	int nums [] = {2, 3, 4, 1, 1, 5, 6, 1, 1, 1, 0, 1, 1, 1, 1, 2, 1};
       System.out.println("Output : "+ findMaxConsecutiveOnes(nums));
        }
	}


