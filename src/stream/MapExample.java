package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class MapExample {
	public static void main(String[] args) {
		
		Map<Integer, String> mymap = new HashMap<Integer, String>();
		mymap.put(1, "Sara1");
		mymap.put(2, "Sara2");
		mymap.put(3, "Sara3");
		mymap.put(2, "Sara3");
		mymap.put(2, "Sara2");
	
		Map<Integer, String> myNewMap = mymap.entrySet().stream().filter(map -> map.getKey().intValue() < 2).collect(Collectors.toMap(map -> map.getKey(),map -> map.getValue()));
		System.out.println(myNewMap);
		
		Map<Integer, String> myNewMap1 = mymap.entrySet().stream().filter(map -> map.getValue().startsWith("S")).filter(map -> map.getValue().equals("Sara2")).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		System.out.println(myNewMap1);
		
		Map<Integer, String> myNewMap2 = mymap.entrySet().stream().filter(map -> map.getValue().equals("Sara2")).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		System.out.println(myNewMap2);

	}
}
