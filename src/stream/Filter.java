package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("1","2","4","1");
		List<String> names1 = names.stream().filter( s -> s.equals("1")).collect(Collectors.toList());
		
		System.out.println(names1);
	}
}
