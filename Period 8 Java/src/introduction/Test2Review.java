package introduction;

public class Test2Review {

	private static boolean grid[][];
	
	public static void main(String[] args) {
		grid = new boolean[5][5];
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
	}

	public static void buttonClick(int r, int c) {
		if (r >= 0 && r < grid.length){
			switchRow(grid[r], c);
		}
		switchColumn(grid, r, c);
		//everything above is 1 point, 0 points if anything is different
		
		//check if a single light is on
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[row].length; col++){
				//1 of 2 points
				if(grid[row][col]) return;
			}
		}
		System.out.println("You have solved the puzzle");
	}
	
	public static void switchRow(boolean[] row, int x){
		for (int i = -1; i < 2; i++){
			if (x + i >= 0 && x + 1 < row.length){
				row[x+i] = !row[x+i];
			}
		}
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if (r >= 0 && r < grid.length && c >= 0 && c < grid.length){
			grid[r][c] = !grid[r][c];
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		switchIfValid(grid, r-1, c);
		switchIfValid(grid, r+1, c);
	}
	
	private static void printGrid(boolean[][] grid){
		for (boolean[] row: grid){
			for (boolean b: row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.print("\n");
		}
		System.out.println("- - - - - - - - -");
	}
}
