public class BinarySearch{
    public static void main(String[]args){
        // trial with a sorted array
        int[] list = new int [100];
        for (int i = 0; i<list.length ; i++){
            list[i] = i;
        }
        System.out.print(binarySearch(list, 12));
    }

    // method for BinarySearch
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (target < array[mid]) {
                high = mid - 1;
            } else if (target > array[mid]) {
                low = mid + 1;
            } else {
                return mid; // target found
            }
        }
        return -low - 1; // target not found
    }
}