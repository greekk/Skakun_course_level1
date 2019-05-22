package all_lessons;

public class SortAlgorithms {

    private static void Swap(int[] array, int i, int j){
        int tmp = 0;
        tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    static void BubbleSort(int[] array, String order){
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

    static void RecursiveSort(int[] array, int ceil){
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


    static void QuickSort(int[] array, int start, int end){
        if(start >= end)
            return;
        int i = start;
        int j = end-1;

        int pivot = i - (i - j)/2;

        while(i < j){
            while((array[i]<= array[pivot]) && (i < pivot))i++;
            while((array[j] > array[pivot]) && (j > pivot))j--;

            if(i < j){
                Swap(array, i,j);
                if(i == pivot)
                    pivot = j;
                else if(j == pivot)
                    pivot = i;
            }


        }
        QuickSort(array, start, pivot);
        QuickSort(array, pivot+1, end);

    }

}
