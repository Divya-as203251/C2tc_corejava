package com.user.streamapiprograms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Streamoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer>stream=Stream.of(10,20,30,40,50,60,70);
		Integer[]values=new Integer[] {3,4,6,7,8};
		stream=Arrays.stream(values);
		System.out.println("squares of"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		System.out.println("First 2 elements");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		System.out.println("skipping 3 elements");
		Arrays.stream(values).skip(3).forEach(System.out::println);
		List<String>words=Arrays.asList("hello","stream");
		words.forEach(System.out::println);
		System.out.println("String in uppercase:");
		List<String>s1=stream1.map(str->str.toUpperCase()).collects(Collectors.toList());
		System.out.println(s1);

	}

}
