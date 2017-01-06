package sorting;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
//		System.out.println("- - - SELECTION SORT - - -");
//		System.out.println(Arrays.toString(arrayToSort));
//		selectionSort(copy(arrayToSort));
		quickSort(arrayToSort);
	}

	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		//System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}
	
	public int[] mergeSort(int[] array){
		if (array.length == 1){
			return array;
		}
		int front = array.length/2;
		int back = (array.length - front);
		
		return array;
	}
	
	public static void quickSort(int[] array){
		for (int i = 0; i < array.length - 2; i++){
			for (int j = i + 1; j < array.length - 1; j++){
				
				if (array[j] < array[i]);
				swap(array, array[i], array[j]);
			}
		}
		
	}
}
