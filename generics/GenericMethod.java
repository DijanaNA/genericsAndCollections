package generics;

public class GenericMethod {
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		printArray(intArray);
		System.out.println();
		Character[] charArray = {'a','b','c'};
		printArray(charArray);
	}
}
