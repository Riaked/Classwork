package introduction;

public class Freshman extends Student {
	
	public String schoolName;
	public Freshman(String name, String school) {
		super(name);
		this.schoolName = school;
	}
	
	public void talk(){
		super.talk();
		System.out.println("I am a freshman starting school in " + schoolName + " this year!");
	}
}
