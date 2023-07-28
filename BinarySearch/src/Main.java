public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 89, 100};
        System.out.println(Main.binarysearch(arr, 1));
        System.out.println(Main.binarysearch(arr, 2));
        System.out.println(Main.binarysearch(arr, 6));
        System.out.println(Main.binarysearch(arr, -5));
    }

    private static Integer binarysearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (element == arr[mid]) {
                return mid;
            }
            if (element < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
