

public class ArrayList {

	public static void main(String[] args) {
		// Java has many interfaces such as Link etc and all these interfaces have their own implementations such as ArrayList
		// <> this sign indicates Generic Programming
		java.util.List<Integer> grades = new java.util.ArrayList<Integer>(); 
		grades.add(5);
		grades.add(10);
		grades.add(1,7); // adding 7 at index 1
//
//		System.out.println(grades.get(0));
//		System.out.println(grades.indexOf(7));
//		System.out.println(grades.contains(7)); // returns boolean 
		
		if(!grades.isEmpty()) {
			System.out.println(grades.remove(0)); // removes that index element
		}
		
		grades.clear(); // clear whole list
		System.out.println(grades.isEmpty());
		
	}
}
