package GroupTask;

import java.util.*;

public class Cities {

	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet<>();
		list.add("Arlington");
		list.add("Fairfax");
		list.add("Alexandra");
		list.add("Falls Church");
		list.add("Rosslyn");
		
		System.out.println(list);
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			if(ite.next().startsWith("A")) {
				ite.remove();
				System.out.println(ite.next());
				
			}
			
		}
		
	}

}
