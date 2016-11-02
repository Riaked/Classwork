package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
		
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
		for (int r = row - 1; r <= row + 1; r++){
			for (int c = col - 1; col <= col + 1; c++){
				if (r >= 0 && r < array.length && c >= 0 && c < array[0].length){
					
				}
			}
		}
		return null;
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
		String[][] pic = new String[10][8];
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
