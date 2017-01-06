package sorting;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public void main(String[] args) {

	}
	
	public String getName(){
		return name;
	}
	
	public Pokemon(String name, int level){
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	}
	
	public void iChooseYou(){
		System.out.println(name + ", " + "I choose you!");
	}
	
	public void attack(Pokemon target, Attack attack){
		if (Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit!");
		}
		else{
			System.out.println("But " + name + " dodged the attack!");
		}
	}
	
	public void lapse(){
		if (poisoned){
			int maxhp = hp;
			hp -= (maxhp/10);
		}
	}
	
	public void setPoisoned(boolean b){
		poisoned = false;
	}
	
	public int getHP(){
		return hp;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
}
