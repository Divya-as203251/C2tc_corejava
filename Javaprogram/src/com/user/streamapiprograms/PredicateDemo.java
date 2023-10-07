package com.user.streamapiprograms;
import java.util.ArrayList;
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>cities=new ArrayList<>();
		cities.add("Goa");
		cities.add("bang");
		cities.add("Chennai");
		Predicate<String>filtercity=city->city.equals("bang");
		cities.stream().filter(filtercity).forEach(System.out::println);
	}

}
