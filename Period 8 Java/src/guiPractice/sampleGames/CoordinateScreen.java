package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.TextLabel;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub	
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		paragraph = new TextArea(40, 85, 550, 500, "This is a whole paragraph. Notice how"
				+ " as the paragraph gets to the edge of a page, a new line is created.");
		button = new Button(40, 200, 100, 30, "Button", new Color(100, 100, 200), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		picture = new Graphic(450, 250, .5, "resources/sampleImages/Angry_Facebook_React_Face.png");
		
		MovingComponent mc = new MovingComponent(30, 60, 80, 80);
		mc.setVy(3);
		mc.setVx(4);
		mc.play();
		
		viewObjects.add(picture);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		viewObjects.add(mc);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
		
	}

	@Override	
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", " + m.getY());

	}
	
	@Override
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	  public void mouseClicked(MouseEvent e) {
		  if(button.isHovered(e.getX(), e.getY())){
		  button.act();
		  }
	  }

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MouseListener getMouseListener(){
		return this;
	}
}
