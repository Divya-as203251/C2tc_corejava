package com.user.collection.comparator;
import java.util.Comparator;
public class sortByRoll implements Comparator<student> {

	@Override
	public int compare(student a, student b) {
		// TODO Auto-generated method stub
		return b.rollNo-a.rollNo;
	}

}
