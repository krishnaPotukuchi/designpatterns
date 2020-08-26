package Override;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("a", "1");
		hm.put("c", "3");
		hm.put("d", "4");
		hm.put("b", "2");
		
		Collections.unmodifiableMap(hm);
		hm.put("0","0");
		Iterator i;
		i = hm.entrySet().iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
