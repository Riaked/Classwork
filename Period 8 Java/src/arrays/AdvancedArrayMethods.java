package arrays;

public class AdvancedArrayMethods {
	
	static int[] array;

	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
		shuffle(array);
		
	}

	private static void shuffle(Object[] array2) {
		for (int i =0; i < array2.length; i++){
			int random = (int)(Math.random()*6);
			swap(array2, i, random);
		}
	}

	private static void swap(Object[] arr, int a, int b) {
		Object placeholder = arr[a];
		arr[b] = arr[a];
		arr[a] = placeholder;
 	}

	private static void method(int[] someArray) {
		int[] newArray = new int[someArray.length];
		
	}
	
	public static void copyArray(int[] original, int[] target){
		if (original.length == target.length){
			for (int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}
		else{
			//print an error message so you know what's up
			System.out.println("ERROR: tried to copy array of two different lengths");
		}
	}
}
