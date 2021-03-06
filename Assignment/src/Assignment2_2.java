/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class Assignment2_2 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0],maxEnd=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEnd=Math.max(maxEnd+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEnd);
        }
        return maxSoFar;
    }


    public static void main(String[] args) {
        int[] nums= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assignment2_2 obj=new Assignment2_2();
        int maxSubArray = obj.maxSubArray(nums);
        System.out.println(maxSubArray);

        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 1000);
        Employee c = new Employee("Bonnie", 22, Gender.MALE, 3000);

        Assignment2 obj2 =new Assignment2();
        obj2.socialSecurityTax(a);
        obj2.insuranceCoverage(a);
        obj2.tripleSalary(a);
        obj2.sortSalary(a,b,c);
    }
}
