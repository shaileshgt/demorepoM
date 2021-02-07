import java.util.Arrays;

class qs {

	public int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return (i + 1);
	}

	public void quicksort(int array[], int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			quicksort(array, low, pi - 1);
			quicksort(array, pi + 1, high);

		}
	}

	public static void main(String[] args) {
		int array[] = { 6, 3, 8, 9, 2, 0 };
		int high = array.length;
		qs s = new qs();
		s.quicksort(array, 0, high - 1);
		System.out.println(Arrays.toString(array));
		

	}
}