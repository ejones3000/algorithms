package twosum;

import java.util.HashMap;

public class TwoSum {
	/*public static int[] calculateSum(int[] array, int target){
		int[] result = new int[2];
		int sum; 
		for(int arrayIndex = 0; arrayIndex < array.length; arrayIndex++){
			for (int i = arrayIndex+1; i < array.length; i ++){
				sum = array[i] + array[arrayIndex];
				if(sum == target){
					result[0] = arrayIndex;
					result[1] = i;
					return result;
				}
			}
		}
		return result;
	}*/
	
	public static int[] calculateSum(int[] array, int target){
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int i = 0; i < array.length; i++){
			h.put(array[i], i);
		}
		
		for (int i =0; i < array.length; i++){
			int comp = target - array[i];
			if(h.containsKey(comp)){
				return new int[] {i, h.get(comp)};
			}
		
		}
	
	throw new IllegalArgumentException("No Sum!");

	}
}
