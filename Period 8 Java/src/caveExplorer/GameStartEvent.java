package caveExplorer;

import caveExplorer.Playable;

public class GameStartEvent implements Playable {
	
	private static final String[] SEQUENCE_1 = {"A little yellow mouse with brown stripes and a lightning shaped tail"
			+ "runs up to you.", "Hi. I can see that you are not from around here."};
	private static final String[] SEQUENCE_2 = {"You are going to have so much fun playing my 2D games",
			"Here, tap this MAP."};

	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		readSequence(SEQUENCE_1);
		System.out.println("Do you like puzzles?");
		while (CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0){
			CaveExplorer.print("No? You don't enjoy puzzles? Please play with me. Pretty please?");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);

	}

	public static void readSequence(String[] seq){
		for (String s: seq){
			CaveExplorer.print(s);
			CaveExplorer.print("- - - Press ENTER - - -");
			CaveExplorer.in.nextLine();
		}
	}
}
