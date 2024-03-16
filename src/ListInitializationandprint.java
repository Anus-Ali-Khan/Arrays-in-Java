import java.util.Arrays;
import java.util.List;

public class ListInitializationandprint {

	public static void main(String[] args) {
		int[] gradeees = {1,4,3,2};
		List<Integer> grades = Arrays.asList(5,3,2,6,3); //converts array into list
		
		System.out.println(Arrays.toString(grades.toArray()));

	}

}
