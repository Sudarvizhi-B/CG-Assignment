package lab6;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
public class SortedMap {
	
	public static List getValues(HashMap<String,Integer> map) {
		List<Integer> list= new ArrayList();
		Set keys= map.keySet();
		Iterator iterator=keys.iterator();
		while(iterator.hasNext()) {
			String key= (String) iterator.next();
			Integer value=(Integer) map.get(key);
			list.add(value);
		}
		Collections.sort(list);
		
		return list;
	}

	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap();
		map.put("Kim Soekjin", 2);
		map.put("Jung Hoseok", 4);
		map.put("Kim Taehyung", 6);
		map.put("Jeon Jungkook", 7);
		map.put("Kim Namjoon", 1);
		map.put("Park Jimin", 5);
		map.put("Min Yoongi", 3);
		System.out.println(getValues(map));
	}

}