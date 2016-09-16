package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student jordan = new Freshman("Jordan", "Brooklyn Tech");
		Student joseph = new Sophmore("Joseph", "red");
		
		
		jillian.talk();
		jordan.talk();
		joseph.talk();
	}

}
