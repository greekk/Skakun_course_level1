package all_lessons;

public class BynarySearch {
    public static int[] Nums = {4,7,2,0,1,6,9,44,3,2};

    public static int Search(int[] array, int key) {
        int floor = 0;
        int ceil = array.length - 1;
        SortAlgorithms.BubbleSort(array, "asc");

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

    public static void main(){
        int s = Search(Nums, 4);
        System.out.println(s);
    }

}
