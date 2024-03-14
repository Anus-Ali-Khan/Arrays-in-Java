
public class forLooptwoDarray {

	public static void main(String[] args) {
		int[][] grades = {
				{1, 5, 3},
				{8, 4, 2, 4, 3, 5, 3},
				{4, 6, 2}
		};
		//System.out.println(grades.length); // whole array length which is 3
		//System.out.println(grades[1].length); // row 0 length which is 7
		
		for(int row=0; row < grades.length; row++) {
			for(int column=0; column < grades[row].length; column++) {
				System.out.print(grades[row][column] + " ");
			}
			System.out.println();
		}
	}

}
