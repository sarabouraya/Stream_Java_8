package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoStreams {
	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1","2","3");
		List<String> names = Arrays.asList("Name","Name","Name");
		
		Stream.concat(numbers.stream(), names.stream()).forEach(str -> System.out.print(str +' '));
	}
}
