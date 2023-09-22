package com.user.collection.comparator;
import java.util.Comparator;
public class sortByName implements Comparator<student>
 {

	@Override
	public int compare(student c, student d) {
		// TODO Auto-generated method stub
		return c.name.compareTo(d.name);
	}

}
