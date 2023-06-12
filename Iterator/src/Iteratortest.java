import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class Iteratortest {

	public static void main(String[] args) {
		List<Integer> it = new ArrayList();

		it.add(9);
		it.add(12);
		it.add(23);
		it.add(45);
		it.add(36);
		it.add(74);

		for (Integer ob : it) {
//			System.out.print("\t" + ob);
//			if(ob==36) {
//				it.remove(new Integer("After remove Print"+ob));
//				
//			}
			System.out.println(ob);
		}
			Iterator<Integer> lst = it.iterator();
			while (lst.hasNext()) {
				Integer i = lst.next();
				if (i == 36) {
					lst.remove();
				}
			}
   System.out.println(" " );
			ListIterator<Integer> lit = it.listIterator();
//			lit.previous();
			Vector<Integer> v = new Vector();
			v.add(9);
			v.add(6);
			v.add(35);
			v.add(7);
			v.add(51);
			Enumeration<Integer> e = v.elements();
			while (e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
		

	}
}
