package packagetwo;

import java.util.ArrayList;
import java.util.List;

public class classtwo {
	public static void main(String[] args) {
		List<Integer> intList= new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		System.out.println("Let's print the elemnets in the list");
		for(int i: intList){
			System.out.println(i);
		}
		
	}

}
