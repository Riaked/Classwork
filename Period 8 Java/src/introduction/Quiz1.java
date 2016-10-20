package introduction;

import java.util.Scanner;

public class Quiz1 {
	static Scanner input = new Scanner(System.in);
	public static String waitForEntry(){
		return input.nextLine();
	}
	//1 point for private visibiliy 
	//1 point for data type declaration
	private static String username = "test_user";
	private static String password = "test";
	//1 point for correct methods
	public static void main (String[] args){
		//1 point for asking username only once
		if (correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown username. Please contact "
					+ "the network administrator");
		}	
	}
	private static boolean correctUser() {
		System.out.println("Enter username");
		//1 point if used .equals
		return waitForEntry().equals(username);	
	}
	private static void askPassword() {
		System.out.println("Enter password");
		//1 point for using while loop
		for (int i = 2; i >= 0; i--){
			if (waitForEntry().equals(password)){
				System.out.println("You're in");
				}
			else{
				if (i == 0){
					System.out.println("Invalid password");
				}
				else{
					System.out.println("You have " + i + " attempts left");
				}
			}
		}	
	}
}
