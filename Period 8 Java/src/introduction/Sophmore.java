package introduction;

public class Sophmore extends Student {

	public String favoriteColor;
	public Sophmore(String name, String color) {
		super(name);
		this.favoriteColor = color;
	}
	
	public void talk(){
		super.talk();
		System.out.println("My favorite color is " + favoriteColor + ", and I am a sophomore.");
	}
}
