package guiPractice.simonGame;

import guiPractice.GUIApplication;
import guiPractice.whackAMole.WhackAMoleGame;
import guiPractice.whackAMole.WhackAMoleScreen;

public class SimonGameHao extends GUIApplication {

	public SimonGameHao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		SimonScreenHao ssh = new SimonScreenHao(getWidth(), getHeight());
		setScreen(ssh);

	}

	public static void main(String[] args) {
		SimonGameHao game = new SimonGameHao();
		Thread app = new Thread(game);
		app.start();

	}

}
