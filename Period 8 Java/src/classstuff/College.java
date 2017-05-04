package classstuff;

public class College {
		
	public void notGoing(){
		going();
		System.out.print("bad ");
	}
	public void going(){
		notGoing();
		System.out.print("good ");
	}

}
