import java.util.*;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================== HashMap Implementation ======================");
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Hammad");
		map1.put(2, "Haris");
		map1.put(3, "Ahmed");
		map1.put(4, "Ibrahim");
		map1.put(5, "Ibad");
		
		//		Traversing Map
		
		for(Map.Entry m: map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		System.out.println("====================== LinkedHashMap Implementation ======================");
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		
		map2.put("a", 101);
		map2.put("b", 102);
		map2.put("c", 103);
		map2.put("d", 104);
		
		
		for(Map.Entry m: map2.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
		
		map3.put(1, "30000");
		map3.put(2, "30200");
		map3.put(3, "30300");
		map3.put(4, "30400");
		
		for(Map.Entry m: map2.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}

	}

}
