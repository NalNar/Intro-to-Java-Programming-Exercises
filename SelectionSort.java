public class SelectionSort {
    public static void main(String[] args) {
        // create an array of unsorted elements
        int[] unsorted = new int[100];

        // fill array with random values from 0 to 99
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = (int) (Math.random() * 100);
        }

        // print sorted array
        for (int num : sort(unsorted)) {
            System.out.print(num + " ");
        }
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // search for the smallest element in the unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // swap if new minimum is found
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
