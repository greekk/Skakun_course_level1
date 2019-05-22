package all_lessons;

import static all_lessons.SortAlgorithms.BubbleSort;
import static all_lessons.SortAlgorithms.RecursiveSort;
import static all_lessons.BynarySearch.Search;
import static all_lessons.SortAlgorithms.QuickSort;

public class home_task2 {
    //Arrays
    static int[] Nums = new int[10];

    static int[] Nums2 = new int[]{4,6,2,54,23,7,9,0,1};
    static int[] Nums3 = {4,7,2,0,1,6,9,44,3,2};

    static float[] Floats = {45.6f,5f,3.14f, 8.9f};

    static String[] StringArray = new String[4];


    //Function for logical tests
    static boolean Foo(){

        System.out.println("I'm Foo!!!");
        return false;
    }

    static boolean Bar(){
        System.out.println("I'm Bar!!!");
        return true;
    }

    static void LogicalBitwiseOperatorsTest(){

        boolean result = Foo() || Bar();
        System.out.println(result + " result of logical OR");

        result = Bar() || Foo();
        System.out.println(result + " result of logical OR");

        result = Foo() | Bar();
        System.out.println(result + " result of bitwise OR");

        result = Bar() | Foo();
        System.out.println(result + " result of bitwise OR");

        System.out.println("***************************");

        result = Foo() && Bar();
        System.out.println(result + " result of logical AND");

        result = Bar() && Foo();
        System.out.println(result + " result of logical AND");

        result = Foo() & Bar();
        System.out.println(result + " result of bitwise AND");

        result = Bar() & Foo();
        System.out.println(result + " result of bitwise AND");

    }
    //While, Do-while loops functions
    static void TestWhileLooper(){

        int i = 0;

        while(i < Nums.length){
            Nums[i] = i;
            System.out.println(Nums[i]);
            i++;

        }
    }

    static void TestDoWhileLooper(){

        int i = Nums2.length;

        do{
            --i;
            System.out.println(Nums2[i]);
        }while(i > 0);
    }

    public static void main(String[] args) {

        //testing how to work logical and bitwise operators
        LogicalBitwiseOperatorsTest();

        //loops
        System.out.println("**********While loop*************");
        TestWhileLooper();

        System.out.println("************Do-While loop****************");
        TestDoWhileLooper();

        //Searches
        RecursiveSort(Nums2, Nums2.length);
        System.out.println("**********Recursive Sorting***************");
        for (int num: Nums2) {
            System.out.println(num);
        }
        BubbleSort(Nums3, "desc");
        System.out.println("**********Bubble Sorting***************");
        for (int num: Nums3) {
            System.out.println(num);
        }
        //QuickSorting testing
        QuickSort(Nums3, 0, Nums3.length);
        System.out.println("**********Quick Sorting***************");
        for (int num: Nums3) {
            System.out.println(num);
        }
        //Binary Search testing
        int res = Search(Nums3, 7);
        System.out.println("**********Binary Searching***************");
        System.out.println(res);
    }
}
