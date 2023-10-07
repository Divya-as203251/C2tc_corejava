package com.user.streamapiprograms;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Intsummarystatistics;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>prime=Arrays.asList(2,3,5,6,7);
		
		IntSummaryStatistics stats=prime.stream().mapToInt(x)->x).summaryStatistics();
		System.out.println("Highest prime in list:"+stats.getMax());
		System.out.println("Lowest prime in list:"+stats.getMin());
		System.out.println("Sum of all prime in list:"+stats.getSum());
		System.out.println("Average of all prime numbers in list:"+stats.getAverage());

	}

}
