package installBinarySearchAlgorithm;

public class BinarySearch {
    int[] list = {2, 3, 4, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > list[mid]) {
                low = mid + 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(binarySearch.list, 2));  /* 0 */
        System.out.println(binarySearch.binarySearch(binarySearch.list, 11)); /* 4 */
        System.out.println(binarySearch.binarySearch(binarySearch.list, 79)); /*12 */
        System.out.println(binarySearch.binarySearch(binarySearch.list, 1));  /*-1 */
        System.out.println(binarySearch.binarySearch(binarySearch.list, 5));  /*-1 */
        System.out.println(binarySearch.binarySearch(binarySearch.list, 80)); /*-1 */
    }
}
