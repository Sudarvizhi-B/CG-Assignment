package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MarkAndMedal {
	
	public static Map<Integer, String> getStudents(Map<Integer,Integer>map){
		
		Map<Integer, String> result = new HashMap<Integer, String>();
		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		
		while(iter.hasNext()) {
			Integer key = (Integer)iter.next();
			if(!result.containsKey(key)) {
				Integer score = (Integer)map.get(key);
				if(score>=90) {
					result.put(key, "Gold");
				}
				else if(score>=80 && score<90) {
					result.put(key, "Silver");
				}
				else if(score>=70 && score<80) {
					result.put(key, "Bronze");
				}
			}
		}
		return result;
		
	}
	public static void main(String[] arg) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 97);
		map.put(2, 85);
		map.put(3, 93);
		map.put(4, 73);
		map.put(5, 90);
		System.out.print(getStudents(map));
	}

}
