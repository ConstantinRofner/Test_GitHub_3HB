package arrays;

public class PictureZoom {

	
	static int [][] matrix = new int[4][5];
	
	int factor = 2;
	
	public static int[][] magnify(int[][]array, int factor){
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = matrix[i][j]*factor;
			}
		}
	}
	
	public static void main(String[] args) {		

	}
}
