package algorithms;

import twosum.TwoSum;

public class Run {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {0, 7, 9, 15};
		int target = 17;
		int[] result = new int[2];
		result = TwoSum.calculateSum(myArray, target);
		for(int i =0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
	
}
