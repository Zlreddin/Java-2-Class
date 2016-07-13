import java.util.ArrayList;

public class OGClass {

	public static void main(String[] args) {
		int[] array1 = { 7, 14, 4, 9, 13, 10, 20, 17, 6, 11, 19, 15, 12, 1, 2, 5, 3, 16, 8, 18};
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(7);
		arraylist.add(14);
		arraylist.add(4);
		arraylist.add(9);
		arraylist.add(13);
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(17);
		arraylist.add(6);
		arraylist.add(11);
		arraylist.add(19);
		arraylist.add(15);
		arraylist.add(12);
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(5);
		arraylist.add(3);
		arraylist.add(16);
		arraylist.add(8);
		arraylist.add(18);

		insertionSort(array1);
		System.out.println("Sorted Array");
		for(int i = 0; i < array1.length; i++){
			System.out.print(array1[i]+ " ");
			}
		System.out.println("");
		selectionSort(arraylist);
		System.out.println("ArrayList" );
		
			System.out.println(arraylist);
			

	}
	// Array List

	public static void selectionSort(ArrayList<Integer> arraylist) {
		for (int i = 0; i < arraylist.size() - 1; i++) {
			Integer currentMin = arraylist.get(i);
			int currentMinIndex = i;

			for (int j = i + 1; j < arraylist.size(); j++) {
				if (currentMin > arraylist.get(j)) {
					currentMin = arraylist.get(j);
					currentMinIndex = j;

				}
			}

			if (arraylist.get(currentMinIndex) != i) {
				arraylist.set(currentMinIndex, arraylist.get(i));
				arraylist.set((i), currentMin);

			}
		}

	}

	// Array

	public static void insertionSort(int[] array1) {
		for (int i = 1; i < array1.length; i++) {
			int currentElement = array1[i];
			int k;
			for (k = i - 1; k >= 0 && array1[k] > currentElement; k--) {
				array1[k + 1] = array1[k];
			}
			array1[k + 1] = currentElement;
		}
	}

}
