package all_lessons;

public class SortAlgorithms {

    public static void Swap(int[] array, int i, int j){
        int tmp = 0;
        tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    public static void BubbleSort(int[] array, String order){
        int ceil = array.length;

        for(int i = 0; i < ceil-1; i++){
            for(int j = i+1; j < ceil; j++){
                switch(order){
                    case "asc":
                        if(array[i] > array[j])
                            Swap(array, i, j);
                        break;
                    case "desc":
                        if(array[i] < array[j])
                            Swap(array, i, j);
                        break;
                }
            }
        }
    }

    public static void RecursiveSort(int[] array, int ceil){
        ceil--;
        if (ceil == 0)
                return;
        int max_value_address = 0, tmp = 0;

        for(int i = 1; i <= ceil; i++){
            if(array[max_value_address]<array[i])
                max_value_address = i;
        }
        Swap(array, max_value_address, ceil);
        RecursiveSort(array, ceil);
    }

/*
    public static void QuickSort(){

    }
*/

}
