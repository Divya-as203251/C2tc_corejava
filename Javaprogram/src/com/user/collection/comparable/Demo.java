package com.user.collection.comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps=new ArrayList<Laptop>();
laps.add(new Laptop("Dell",15,170000));
laps.add(new Laptop("HP",14,130000));
laps.add(new Laptop("apple",14,130000));
Collections.sort(laps);
for(laptop l:laps)
{
	System.out.println()
}

	}

}
