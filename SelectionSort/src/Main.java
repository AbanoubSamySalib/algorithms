public class Main {
    public static void main(String[] args) {

        Integer arr[] = {9000, 2, 99, 1, 0, 3, 500, -2, -5, 4000};

        Integer[] sortedArray = selectionSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private static Integer[] selectionSort(Integer arr[]) {
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        return arr;
    }
}
