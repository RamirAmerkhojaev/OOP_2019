package Task4;

public class Sort {

	static <E> void swap(E array[], int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	static <E extends Comparable<E>> void bubbleSort(E[] array) {
		for(int i = 0; i<array.length -1; i++) {
			for(int j=0; j<array.length -i - 1; j++) {
				if(array[j].compareTo(array[j+1]) > 0)
					swap(array ,j, j+1);
			}
		}
	}
	static <E extends Comparable<E>> void selectionSort(E[] array) {
		int min;
		for(int i=0; i<array.length - 1; i++) {
			min = i;
			for(int j = i+1; j<array.length; j++) 
				if(array[min].compareTo(array[j]) > 0) 
					min = j;
				
				swap(array, min, i);
			
		}
	}
	
}
