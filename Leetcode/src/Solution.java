
class Solution {
	
	
	
	
	
	public boolean canMakeArithmeticProgression(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);}
		int h = arr[1] - arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			// int j= arr[i+1]-arr[i];
			for (int j = i + 1; j > i; j--) {
				int m = arr[j] - arr[i];
				if (h != m) {
					return false;
				}
			}
		}

		return true;
	}
}