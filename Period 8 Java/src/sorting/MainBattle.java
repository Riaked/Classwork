package sorting;

public class MainBattle {

	public static void main(String[] args) {
		 Pokemon serviper = new Pokemon("Serviper",26);
		 Pokemon absol = new Pokemon("Absol",26);
		 absol.iChooseYou();
		 serviper.iChooseYou();
		 System.out.println("Absol is preparing to attack with dark slash");
		 absol.attack(serviper, new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				int newHP = target.getHP()/2;
				target.setHP(newHP);
				
			}
		});
		 System.out.println("Serviper is preparing to attack with toxic");
		 serviper.attack(absol, new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				target.setPoisoned(true);
			}
		});
		 
		 
		 absol.lapse();
		 serviper.lapse();
		 printScore(absol, serviper);
	}

	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName() + ", HP = " + p1.getHP());
		System.out.println(p2.getName() + ", HP = " + p2.getHP());
	}
		 
}
