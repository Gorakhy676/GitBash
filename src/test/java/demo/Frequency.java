package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency {
	public static void main(String[] args) {
		int[] a= {};
		Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			m1.put(a[i], m1.getOrDefault(a[i], 0)+1);
		}
		
		Set<Map.Entry<Integer, Integer>> ent=m1.entrySet();
		Iterator<Entry<Integer, Integer>> itr=ent.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> x=itr.next();
			System.out.println(x.getKey()+"   "+x.getValue());
		}
		
	}

}
