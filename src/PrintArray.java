import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		//Print array in console
		int[] grades = {10,9, 8,7 ,6,5,4,3,2,1};
		System.out.println(Arrays.toString(grades));
		
		//deeptostring used to print nested arrays (arrays in arrays ) 
		int [][] marks = {{60,40,70, 90}, {100, 50}};
		System.out.println(Arrays.deepToString(marks));

	}

}
