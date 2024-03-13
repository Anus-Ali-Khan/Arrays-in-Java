import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

	public static void main(String[] args) {
	int[] grades1 = {1,2,3,72,5};
	int[] grades2 = {1,2,3,72,5};
	
	// 1st method(equals)
	
	if(grades1 == grades2) {
		System.out.println("equals");
	}
	
	if(grades1.equals(grades2)) {
		System.out.println("equals");
	}
	
	// above both equations will work if we write grades1 = grades2 
	
	System.out.println(grades1  + " " + grades2); // since both the values of arrays are different as we display in console thats why they are not equal
	
	if(Arrays.equals(grades1, grades2)) {
		System.out.println("equals finally");
	}
	
	//2nd Method (fill)
	
	String[] grades = new String[5];
	Arrays.fill(grades,"");
	System.out.println(Arrays.toString(grades));
	
	//3rd Method (asList)
	List<String> testing = Arrays.asList(grades);
	
	}

}
