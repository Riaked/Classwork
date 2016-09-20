package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		
		int[] results = new int[6];
		//declare variable, test logic, increment
		for(int index = 0; index < 10000; index ++){
			int result = rollUnfairDie();
			System.out.println("Roll #" + (index+1)+
					": "+result);
			results[result-1] ++;
		}
		//print the results
		for(int i = 0; i < 6; i++){
			System.out.println((i+1)+" appeared " + results[i] + " times.");
		}
		
	}
	
	//return 1,2,3,4,5,6 with equal probability 
	public static int rollFairDie(){
		double rand = Math.random();//This returns a double between (0,1)
		int roll = (int) (6*rand);//This returns any number between[0,5]
		roll ++;//This returns a number between [1,6]
		return roll;
	}
	public static int rollUnfairDie(){
		double rand2 = Math.random();
		int roll2 = (int) (6*rand2);
		roll2++;
		double rand3 = Math.random();
		int roll3 = (int) (6*rand3);
		roll3++;
		if (roll3 > roll2)
			return roll3;
		else
			return roll2;
		
		
			
	}
}
