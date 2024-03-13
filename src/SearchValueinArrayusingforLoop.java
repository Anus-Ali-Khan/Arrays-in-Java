import java.util.Arrays;

public class SearchValueinArrayusingforLoop {

	public static void main(String[] args) {
	int[] grades = {1, 2, 3, 72, 5 };
	
	for(int i=0;i < grades.length; i++) {
		if(grades[i] == 72) {
			System.out.println("FOUND! Found at index " + i);
		} 
		// Arrays.binarySearch() also used to find values in arrays
	}

	}

}
