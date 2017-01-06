package sorting;

public class Factorials {

	private static int count = 1;
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println("The " + n + "th Fibonacci is " + fibonacci(n));
		//hanoiSolution(8, "A", "B", "C");
	}

	private static int fibonacci(int n) {
		if (n <= 1){
			return 1;
		}else{
			int previous = fibonacci(n - 1);
			print("Before we find fibonacci " + n + " we need to find fibonacci " + (n - 1) + ", which is " + previous);
			int beforePrevious = fibonacci(n - 2);
			return previous + beforePrevious;
		}
	}

	public static void print(String s){
		System.out.println("Move #" + count + ": " + s);
		count++;
	}
//	private static int factorial(int x) {
//		int num = 1;
//		for (int i = x; i > 0; i--){
//			num = num * i;
//		}
//		return num;
//	}
//	private static int recursionFactorial(int x){
//		if (x > 1){
//			return x * factorial(x - 1);
//		}
//		return 1;
//	}
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if (numberOfDiscs <= 1){
			print("Move "+ startPeg + " to " + endPeg);
		}else{
			System.out.println("In order to move " + numberOfDiscs + " over to peg "+ endPeg + 
					" we must move " + (numberOfDiscs -1) + " over to peg "+ midPeg + " first.");
			hanoiSolution(numberOfDiscs - 1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs - 1, midPeg, startPeg, endPeg);
		}
	}

}
