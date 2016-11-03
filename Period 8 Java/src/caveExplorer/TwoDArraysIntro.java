package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;
	
public class TwoDArraysIntro {

	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	
	public static void main(String[] args) {
		pic = new String[5][5];
		for (int row = 0; row < pic.length; row++){
			for (int col = 0; col < pic[row].length; col++){
				pic[row][col] = "[]";
			}
		}
		arr2D = new String[5][5]; 
		//populate new array with coordinates
		for (int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
		}
		starti = 2;
		startj = 2;
		treasurei = 4;
		treasurej = 3;
		startExploring();
	}
	
	private static void startExploring() {
		while (true){
			pic[starti][startj] = "[X]";
			printPic(pic);
			System.out.println("You are in room " + arr2D[starti][startj]);
			if (starti == treasurei && startj == treasurej){
				System.out.println("You've found the treasure. You win!");
				break;
			}
			
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
		
	}

	private static int[] interpretInput(String input) {
		//verify input is an acceptable input
		while (!isValid(input)){
			System.out.println("Invalid input. Please use W, A, S, D for controls.");
			System.out.println("What do you want to do?");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if (input.equals("w")){currenti--;}
		if (input.equals("a")){currentj--;}
		if (input.equals("s")){currenti++;}
		if (input.equals("d")){currentj++;}
		int[] newCoordinates = {starti, startj};
		if (currenti >= 0 && currenti < arr2D.length && currentj >= 0 && currentj < arr2D[0].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}
		else{
			System.out.println("You walked into a wall");
		}
		return newCoordinates;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w", "a", "s", "d"};
		for (String key: validKeys){
			if (input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}

	public static void grid(){
		String[][] pic = new String[5][5];
		for (int row = 0; row < pic.length; row++){
			for (int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		//sun
		//grassy field
		//top and bottom row is underscore
		for (int col = 0; col < pic[0].length; col++){
			for (int row = 0; row < pic.length; row++){
				pic[row][col] = "___";
			}
		}
		//first and last row is "|"
		for (int row = 0; row < pic.length; row++){
			pic[row][0] = "|" + "\n" + "|" + "\n" + "|";
			
		}
		
		for (String[] row: pic){
			for (String col: row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void mineSweeper(){
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for (int row = 0; row < field.length; row++){
			for (int col = 0; col < field[row].length; col++){
				if (mines[row][col]){
					field[row][col] = "X";
				}
				else{
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}
		return field;
	}

	private static String countNearby(boolean[][] array, int row, int col) {
		//This checks outside the array
//		for (int r = row - 1; r <= row + 1; r++){
//			for (int c = col - 1; col <= col + 1; c++){
//				if (r >= 0 && r < array.length && c >= 0 && c < array[r].length){
//					
//				}
//			}
//		}
//		return null;
		//This method only considers actual elements inside the array
//		int count = 0;
//		for (int r = 0; r < array.length; r++){
//			for (int c = 0; c < array[r].length; c++){
//				if ((Math.abs(r - row) + Math.abs(c - col) == 1) && array[r][c]){
//					count++;
//				}
//			}
//		}
//		return "" + count;
		//This method allows you to be specific
		//e.g. you only want north and east
		int count = 0;
		count += isValidAndTrue(array, row - 1, col);
		count += isValidAndTrue(array, row + 1, col);
		count += isValidAndTrue(array, row, col - 1);
		count += isValidAndTrue(array, row, col + 1);
		return "" + count;
		
	}

	private static int isValidAndTrue(boolean[][] array, int i, int j) {
		if (i >= 0 && i < array.length && j >= 0 && j < array[i].length && array[i][j]){
			return 1;
		}
		return 0;
	}

	private static void plantMines(boolean[][] mines) {
		int numberOfMines = 12;
		while(numberOfMines > 0){
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			//this prevents the same mine from being selected twice
//			while (mines[row][col]){
//				row = (int)(Math.random() * mines.length);
//				col = (int)(Math.random() * mines[0].length);
//			}
			if (!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
		
	}

	public static void picMaking(){
		String[][] pic = new String[5][5];
		for (int row = 0; row < pic.length; row++){
			for (int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		//sun
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[1][2] = "O";
		pic[2][1] = "/";
		pic[2][2] = "|";
		pic[2][3] = "|";
		//grassy field
		//top and bottem row is underscore
		for (int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		//first and last row is "|"
		for (int row = 1; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|";
		}
		for (int row = 5; row < pic.length-1; row++){
			for (int col = 1; col < pic[row].length-1; col++){
				pic[row][col] = "w";
			}
		}
	}
	
	public static void intro(){
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.println(Arrays.toString(xox));
		//a ID array prints a horizantal string
		
		String[][] arr2D = new String[5][4];
		System.out.println("The height is " + arr2D.length);
		System.out.println("The width is " + arr2D[0].length);
		for (int row = 0; row < arr2D.length; row++){
			//populate new array with coordinates
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")" ;
			
			
			}
		}
		//print the 2D array
		//Every element in a 2D array is an array by itself
		//a for-each loop looks like this
		for (String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		
		}
	}
	public static void printPic (String[][] pic){
		for (String[] row: pic){
			for (String col: row){
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
