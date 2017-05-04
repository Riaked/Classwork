package classstuff;

public class Student extends College{

	private static Student james;
	
	public static void main(String[] args){
		 int[][] g2 ={{-3, 4, -8},           
	              	{14, 2, 21},
	   	            {3, 32, -3}};
		 System.out.print(removeRowCol(g2,1,1));
	}
	
	public void attending(){
		
}

	public static int[][] removeRowCol(int[][] mat, int row, int col){
        int k = 0;
        int l = 0;
        int[][] newMat = new int[mat.length - 1][mat[0].length - 1];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(j == col){
                    j++;
                }
                else if(i == row){
                    i++;
                }
                else if (l < newMat[0].length) {
                    newMat[k][l] = mat[i][j];
                    l++;
                }
                else {
                    l = 0;
                    k++;
                    newMat[k][l] = mat[i][j];
                    }
                }
            }
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
        return newMat;
    }


}
