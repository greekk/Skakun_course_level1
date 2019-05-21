package all_lessons;
import static all_lessons.SortAlgorithms.BubbleSort;


public class BynarySearch {


    public static int Search(int[] array, int key) {
        int floor = 0;
        int ceil = array.length - 1;
        BubbleSort(array, "asc");

        while (floor <= ceil) {
            int mid = floor + (ceil - floor) / 2;
            if (key < array[mid])
                ceil = mid - 1;
            else if (key > array[mid])
                floor = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}
