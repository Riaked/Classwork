package caveExplorer;

public class HaoSyedRoom extends CaveRoomPd8 {

	public HaoSyedRoom(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	public void enter(){
		super.enter();
		System.out.println("You are locked in this room");
		//for loop to close all doors
		
	}
}
