import java.util.Arrays;
import java.util.List;

public class NestedForEach {

	public static void main(String[] args) {
		List<List<Integer>> allGrades = new java.util.ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(5,3,2,6,3));
		allGrades.add(Arrays.asList(5,4,8,6,3));
		allGrades.add(Arrays.asList(5,7,29,6,3));
		
		for(List<Integer> grades:allGrades) {
			for(int grade:grades) {
				System.out.print(grade + " ");
			}
			System.out.println();
		}
	}

}
