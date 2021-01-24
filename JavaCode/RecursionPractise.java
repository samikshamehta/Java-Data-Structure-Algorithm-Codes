package lect6;

public class RecursionPractise {

	static void towerOfHanoi(int n, char src, char hlpr, char dest) {
		if (n == 0) {
			// System.out.println("Moving "+n+"th ring from"+src +"to "+dest);
			return;
		}
		towerOfHanoi(n - 1, src, dest, hlpr);
		System.out.println("Moving " + n + "th ring from " + src + " to "
				+ dest);
		towerOfHanoi(n - 1, hlpr, src, dest);
	}

	void mergeSort(int[] input) {
		if (input.length == 1) {
			return;
		}

		int[] leftArray = new int[input.length / 2];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = input[i];
		}
		int[] rightArray = new int[input.length - leftArray.length];
		for (int i = leftArray.length; i < input.length; i++) {
			rightArray[i] = input[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, input);
		// input =merge(leftArray,rightArray);
	}

	int[] merge(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}
		return result;
	}

	void merge(int[] arr1, int[] arr2, int[] result) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}

	}

	// merge(leftArray, RightArry)

	static int factorial2(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}

		return num * factorial2(num - 1);
	}

	static int fib(int num) {
		if (num == 0 || num == 1) {
			return num;
		}

		return fib(num - 1) + fib(num - 2);
	}

	static boolean search7(int[] arr) {
		if (arr.length == 0) {
			return false;
		}
		if (arr[0] == 7) {
			return true;
		}
		int[] smallArr = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		return search7(smallArr);
	}

	static int search7ReturnIndex(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		if (arr[0] == 7) {
			return 0;
		}
		int[] smallArr = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		int result = search7ReturnIndex(smallArr);
		if (result == -1) {
			return -1;
		}
		return result + 1;
	}

	boolean isArraySorted(int[] arr, int index) {
		if (arr.length == 0 || index == arr.length - 1) {
			return true;
		}

		if (arr[index] > arr[index + 1]) {
			return false;
		}
		return isArraySorted(arr, index + 1);
	}

	static boolean search7WithIndex(int[] arr, int index) {
		if (arr.length == index) {
			return false;
		}
		if (arr[index] == 7) {
			return true;
		}
		return search7WithIndex(arr, index + 1);
	}

	static int minInArray(int[] arr, int index, int min) {
		if (arr.length == index) {
			return min;
		}
		if (min > arr[index]) {
			min = arr[index];
		}
		return minInArray(arr, index + 1, min);
	}

	static int minInArray(int[] arr, int index) {
		if (arr.length == index) {
			return Integer.MAX_VALUE;
		}
		int smallAns = minInArray(arr, index + 1);
		if (smallAns > arr[index]) {
			return arr[index];
		}
		return smallAns;
	}

	public static void main(String[] args) {
		// int[] arr = {4,7,5,7,7,0};
		// String[] ans = keyPad(256);
		// for(int i =0;i<ans.length;i++){
		// System.out.println(ans[i]);
		// }
		
		String str= "".substring(0, 0);

		towerOfHanoi(3, 'A', 'B', 'C');

	}

	static int[] allIndicesOf7(int[] arr, int index) {
		if (index == arr.length) {
			int[] ans = {};
			return ans;
		}
		int[] smallAns = allIndicesOf7(arr, index + 1);
		if (arr[index] != 7) {
			return smallAns;
		}

		int[] ans = new int[smallAns.length + 1];
		ans[0] = index;
		for (int i = 0; i < smallAns.length; i++) {
			ans[i + 1] = smallAns[i];
		}
		return ans;
	}

	int lastIndexOf7(int[] arr, int index) {

		if (arr.length == index) {
			return -1;
		}

		int smallAns = lastIndexOf7(arr, index + 1);
		if (smallAns == -1) {
			if (arr[index] == 7) {
				return index;
			}
		}
		return smallAns;
	}

	static String[] keyPad(int num) {
		if (num == 0) {
			String[] ans = { "" };
			return ans;
		}
		String[] smallAns = keyPad(num / 10);
		String code = getCode(num % 10);
		String[] ans = new String[smallAns.length * code.length()];
		int k = 0;
		for (int i = 0; i < code.length(); i++) {
			for (int j = 0; j < smallAns.length; j++) {
				ans[k++] = smallAns[j] + code.charAt(i);
			}
		}

		return ans;
	}

	static private String getCode(int i) {
		String[] arr = { " ", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS" };

		return arr[i];
	}

	static void printSubSequence(String input, String smallResult) {
		if (input.length() == 0) {
			System.out.println(smallResult);
			return;
		}

		printSubSequence(input.substring(1), smallResult);
		printSubSequence(input.substring(1), smallResult + input.charAt(0));

	}
	
	
	
	void printPermutation(String input, String smallAns){
		if(input.length()==0){
			System.out.println(smallAns);
			return;
		}
		
		for(int i =0;i<input.length();i++){
			String newInput = input.substring(0, i)+input.substring(i+1);
			String newSmallAns = smallAns+input.charAt(i);
			printPermutation(newInput, newSmallAns);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
