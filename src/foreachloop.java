import java.util.Arrays;
import java.util.List;

public class foreachloop {

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(5,3,2,6,3);
		
		for(int grade: grades) {
			System.out.println(grade);
		}

	}

}

