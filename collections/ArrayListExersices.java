package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExersices {
	// list of coulors
	static void listColors() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("green");

		// eden nachin na pechatenje
		System.out.println("Colors: " + list);

		// vtor nachin na pechatenje
		for (String string : list) {
			System.out.println("Color: " + string);
		}
	}

	// insert element on first position
	static void insertElement() {
		// kreirame objekt od ArrayList
		// toj objekt e list
		List<String> list = new ArrayList<String>();

		// so add dodavame elemento vo listata
		list.add("red");
		list.add("green");
		list.add("blue");

		System.out.println("Before insertion " + list);
		// dodava element na prvata pozicija (index 1)
		list.add(1, "yellow");
		System.out.println("After insertion " + list);

	}

	static void returnElement(int index) {
		List<String> list = new ArrayList<String>();
		list.add("red");
		list.add("green");
		list.add("blue");

		if (list.size() > index) {
			// ni pechati element na pozicijata index
			System.out.println("Element " + list.get(index));
		} else {
			System.out.println("Listata nema tolku elementi");
		}
	}

	static void updateElement(String color) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("green");

		System.out.println("Before change: " + list);
		list.set(0, color);
		list.set(1, "white");
		System.out.println("After change: " + list);
	}

	static void removeElement() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int tmp = 3;
		if (tmp < list.size()) {
			System.out.println("Before removal: " + list);
			list.remove(tmp);
			System.out.println("After removal: " + list);
		} else {
			System.out.println("Listata e pomala od elementot");
		}

	}

	static boolean searchElement(String s) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("green");

		// proveruvame dali listata go sodrzi elementot
		if (list.contains(s)) {
			return true;
		} else {
			return false;
		}
	}

	static void sortList(ArrayList<Integer> list) {
		System.out.println("Before sort: " + list);
		// 1-2-3
		Collections.sort(list);
		System.out.println("Rastechki " + list);
		// 3-2-1
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Opagjachki " + list);
	}

	static void reverseElements() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("green");

		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reverse " + list);
	}

	static void copyList(ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(200);
		list.add(300);
		list.add(200);
		list.add(300);
		list.add(200);
		System.out.println("Prva: " + list);
		Collections.copy(list, list2);
		System.out.println("After copy: " + list);
	}

	static void joinLists(ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(200);
		list.add(300);

		System.out.println("Prva " + list);
		list.addAll(list2);

		System.out.println("Prva + Vtora " + list);
	}

	static void printEvenNumbers(ArrayList<Integer> list) {
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				System.out.println("Paren " + integer);
			}
		}
	}

	public static void main(String[] args) {
		listColors();
		insertElement();
		returnElement(5);
		updateElement("pink");
		removeElement();
		System.out.println(searchElement("pink"));

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(2);
		list.add(77);
		list.add(4);
		list.add(190);

		sortList(list);
		copyList(list);
		reverseElements();
		joinLists(list);
		printEvenNumbers(list);
		
	}
}
