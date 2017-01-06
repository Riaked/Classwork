package sorting;

public class RecursionIntro {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			System.out.println("Hello world! x" + i);
		}
		System.out.println("Without using a for loop:");
		forLoop(5, new Action() {
			
			private int value = 0;
			public void act() {
				System.out.println("Hello world! x" + value);
				value++;
			}
		});
	}

	private static void forLoop(int i, Action action) {
		if (i <= 0){
			return;
		}else{
			action.act();
			forLoop(i - 1, action);
		}
	}
}
