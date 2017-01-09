package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.ClickableScreen;
import guiPractice.TextLabel;
import guiPractice.components.Action;
import guiPractice.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}
	
	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects){
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50, 120, 60, "");
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
	}
	
	private PlayerInterface getAPlayer(){
		return new Player(20,20);
	}

	private MoleInterface getAMole(){
		return new Mole((int)(getWidth() * Math.random()) - 100, (int)(getHeight() * Math.random()));
	}
	
	private void changeText(String s){
		try{
			label.setText(s);
			Thread.sleep(1000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void run(){
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText("" + timeLeft);
		while (timeLeft > 0){
			//fps
			try{
				Thread.sleep(100);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText("" + (int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
	}
	
	private void addNewMoles() {
		//probability of mole appearing depends on timeLeft
		double probability = .2 + .1 * (30.0 - timeLeft)/30;
		if (Math.random() < probability){
			final MoleInterface mole = getAMole();
			//between .5 and 2.5 seconds
			mole.setAppearanceTime((int)(500 + Math.random() * 2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//remove the mole
					remove(mole);
					//remove mole from database;
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	public void update(){
		super.update();
	}
	
	private void disappearMoles() {
		//mole has individual clocks
		for (int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime() - 100);
			if (m.getAppearanceTime() <= 0){
				//remove from the visible screen
				remove(m);
				//remove from mole database
				moles.remove(i);
				//compensates for the i++ in the for loop
				i--;
			}
		}
	}
}
