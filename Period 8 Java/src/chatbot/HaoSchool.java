package chatbot;

public class HaoSchool extends Object implements Chatbot {
	private boolean inSchoolLoop;
	
	private String schoolResponse;
	
	public void talk(){
		inSchoolLoop = true;
		while (inSchoolLoop){
			NocklesMain.print("(Type 'quit' to go back.)");
			schoolResponse = NocklesMain.promptInput();
			if (schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				NocklesMain.promptForever();
			}
			NocklesMain.print("That's my favorite part about school!");
			
		}
	}
	public boolean isTriggered(String userInput) {
		String [] triggers = {"school", "class", "teacher",};
		//idea:create a for loop to iterate
		
		if (NocklesMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "money", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "music", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "candy", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "food", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "life", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "war", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "medicine", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "hospital", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "Hitler", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "Japan", 0) >= 0){
			return true;
		}
		if (NocklesMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}
}
