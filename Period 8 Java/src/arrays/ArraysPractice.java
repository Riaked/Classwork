package arrays;

public class ArraysPractice {

	static boolean [] boos3;
	public static void main(String[] args) {
		
		listPrimes(120);
		
	/*	
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
				
		int[] fiftyNumbers = new int [5000];
		//populate(fiftyNumbers);
		//print(fiftyNumbers);
		//randomize(fiftyNumbers, 50);
		//print(fiftyNumbers);
		rollDice(fiftyNumbers, 4);
		print(fiftyNumbers);
		//count each die roll and provides a percentage
		countResult(fiftyNumbers, 4);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime - currentTime) + " ms");
	*/
		
	}
	
	private static void listPrimes(int limit) {
		int lastToCheck = (int)(Math.sqrt(limit));
		boolean[] numbers = new boolean[limit + 1];
		for (int i = 0; i < limit + 1; i++){
			numbers[i] = true;
		}
		//0 and 1 by definition are not prime
		numbers[0] = false;
		numbers[1] = false;
		//checks all the non-crossed out numbers starting with 2
		for (int prime = 2; prime <= lastToCheck; prime++){
			if (numbers[prime]){
				System.out.print("\n" + prime + " is prime." + " Crossing off: ");
				for (int i = (int)(Math.pow(prime, 2)); i < limit + 1; i += prime){
					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		//print the primes
		System.out.println("\nThe prime numbers from 0 to " + limit + " are: ");
		for (int index = 0; index < numbers.length; index++){
			if (numbers[index]) System.out.print(index + ", ");
		}
	}

	
	
	
	
	
	
	
	private static void countResult(int[] intArray, int numberOfDie) {
		int[] counter = new int[numberOfDie*6];
		for (int n: intArray){
			counter[n-1] = counter[n-1] + 1;
		}
		for (int i = numberOfDie-1; i < counter.length; i++){
			System.out.println((i+1) + " was rolled " + (100*counter[i]/intArray.length) + 
					" % of the time");
		}
	}

	private static void rollDice(int[] fiftyNumbers, int numberOfDie) {
		for (int i = 0; i < fiftyNumbers.length; i++){
			int die = 0;
			for (int j = 0; j < numberOfDie; j++){
				die = die + (int)(1+6*Math.random());
			}
			fiftyNumbers[i] = die;
		}
	}

	private static void randomize(int[] fiftyNumbers, int max) {
		for (int i = 0; i < fiftyNumbers.length; i++){
			fiftyNumbers[i] = (int) (Math.random() * max);
			System.out.println(fiftyNumbers[i]);
		}
	}

	private static void print(int[] intArray) {
		for (int i = 0; i < intArray.length; i++){
			System.out.println(intArray[i]);
		}
		System.out.println("this is the end of this method");
	}

	private static void populate(int[] fiftyNumbers) {
		for (int i = 0; i < fiftyNumbers.length; i++){
			int string = (i+1);
			fiftyNumbers[i] = string;
		}
	}

	private void demonstratePassbyValue(){
		int x = 10;
		increase(x);
		System.out.println(x);
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		someStrings[999] = getASpecialString();
		print(someStrings);
	}
	private static String getASpecialString() {
		return "THIS STRING IS SPECIAL";
	}

	private static void increase(int i){
		i++;
	}
	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL";
		
	}

	private static void print(String[] s) {
		for (int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}

	private static void standardPopulate(String[] s) {
		for (int i = 0; i < s.length; i++){
			String string = "String #" + (i+1);
			s[i] = string;
		}
		
	}

	public static void initializingArraysExample(){
		boolean[] boos1 = new boolean [3];
		//this can only be done at the declaration
		//this sets size and content
		boolean[] boos2 = {false, false, false};
		//this does not work
		//boos3 = {false, true, true};
		boos3 = new boolean[3];
		
		
		/**two ways of iterating through an array
		STANDARD FOR LOOP
			- index is important to keep track of
			- need to customize order
		*/
		
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		
		/**
		 "FOR - EACH" LOOP
		 	-index is not important
		 	-dont need to customize
		 	-automatically assigns a handle
		 	-faster
		 */
		for(boolean b:boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		String [] someStrings1 = new String[3];
		someStrings1[0] = "a";
		someStrings1[1] = "b";
		someStrings1[2] = "c";
		//quite repetitive
		
		String [] someStrings2 = {"a", "b", "c"};
		
		for(int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "A new String";
		}
		//a loop to print it
		for(String s:someStrings1){
			System.out.println(s);
		}
	}
	
}
