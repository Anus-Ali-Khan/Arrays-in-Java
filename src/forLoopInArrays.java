import java.util.Arrays;
import java.util.Scanner;

public class forLoopInArrays {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		System.out.println("Enter values");
		
		int[] grades = new int[size];
				
		for(int i=0; i < size; i++) {
			int x = input.nextInt();
			grades[i] = x;
		}
		System.out.println(Arrays.toString(grades));
	}

}
