package lab6;

import java.util.*;
import java.text.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class VoterList {
	public static List<Integer> voterList(HashMap<Integer, String>map) throws ParseException{
		List<Integer> list = new ArrayList();
		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		while(iter.hasNext()) {
			Integer key = (Integer)iter.next();
			String value = (String)map.get(key);
			SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
			Date date = format.parse(value);
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate local = zone.toLocalDate();
			Period period = Period.between(local, LocalDate.now());
			if(period.getYears() >=18) {
				list.add(key);
			}
		}
		return list;
	}

	public static void main(String[] args) throws ParseException {
		
		HashMap<Integer, String> map = new HashMap();
		
		map.put(1, "15-08-1999");
		map.put(2, "18-02-1994");
		map.put(3, "31-12-1995");
		map.put(4, "10-01-2005");
		map.put(5, "25-06-1969");
		map.put(6, "07-10-2013");
		map.put(7, "14-02-2009");
		
		System.out.print(voterList(map));

	}

}
