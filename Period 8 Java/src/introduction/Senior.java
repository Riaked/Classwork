package introduction;

public class Senior extends Student {

	
	public Senior(String name) {
		super(name);//contructs a student first
		
	}
	
	public void talk(){
		super.talk();
		System.out.println("I really hate school.");
	}
}
