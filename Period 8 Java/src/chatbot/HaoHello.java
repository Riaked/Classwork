package chatbot;

public class HaoHello implements Chatbot {

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String [] calmResponses = {"Ey sonny", "I've been hearin lots a hello lately", 
			"Yes, yes hello sonny"};
	private String [] angryResponses = {"Zzzzzzzz", "Ey I haven't seen ya around these parts before",
			"Who are you again?"};
	
	private int helloCount;
	
	public HaoHello(){
		helloCount = 0;
	}
	@Override
	public void talk() {
		inHelloLoop = true;
		while (inHelloLoop){
			helloCount++;
			printResponse();//helper method
			helloResponse = NocklesMain.promptInput();
			//negate use
			if (!isTriggered(helloResponse)){
				inHelloLoop = false;
				NocklesMain.promptForever();
				}
		}
			
	}

	private void printResponse() {
		if (helloCount > 3){
			int responseSelection = (int) (Math.random()* angryResponses.length);
			NocklesMain.print(angryResponses[responseSelection]);
		}
		else {
			int responseSelection = (int) (Math.random()* calmResponses.length);
			NocklesMain.print(calmResponses[responseSelection]);
		}
		
	}
	@Override
	public boolean isTriggered(String userInput) {
		if (NocklesMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
	}

}
