package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		// dvete implementacii na List interfejsot
		// ne moze da se iskreira objekt od interfejs
		// mora da iskoristime negova implementacija
		
		arrayList.add("Volvo");
		arrayList.add("BMW");
		arrayList.add("Ford");
		
		System.out.println("Lista" + arrayList);
		
		String s1 = arrayList.get(0);
		String s2 = arrayList.get(2);
		
		System.out.println(s1 + " " + s2 + " " + arrayList.get(1));
		
		
		
		List<String> l = new Vector<String>();
		List<String> arrayList2 = new ArrayList<String>();
		
		
		//da se isprinta od koj tip e objektot
		System.out.println(arrayList2.getClass());

		// nizite imaat fiksna golemina - nepromenliva
		// ako sakame da dodademe element, treba da iskreirame nova niza
		// i vo nea da gi sikopirame/dodadem site elementi od prethodnata plus novite
		int[] i = { 1, 2, 3 };
		

	}
}
