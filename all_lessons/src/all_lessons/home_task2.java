package all_lessons;

public class home_task2 {
    //Arrays
    static int[] Nums = new int[10];

    static int[] Nums2 = new int[]{4,6,2,54,23,7,9,0,1};

    static float[] Floats = {45.6f,5f,3.14f, 8.9f};

    static String[] StringArray = new String[4];

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
        System.out.println(result);

        result = Bar() || Foo();
        System.out.println(result);

        result = Foo() | Bar();
        System.out.println(result);

        result = Bar() | Foo();
        System.out.println(result);

        System.out.println("***************************");

        result = Foo() && Bar();
        System.out.println(result);

        result = Bar() && Foo();
        System.out.println(result);

        result = Foo() & Bar();
        System.out.println(result);

        result = Bar() & Foo();
        System.out.println(result);

    }

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
        //LogicalBitwiseOperatorsTest();

        //loops
        System.out.println("**********While loop*************");
        TestWhileLooper();

        System.out.println("************Do-While loop****************");
        TestDoWhileLooper();

        //Searches
        //RecursiveSort(Nums, Nums.length);
        //BubbleSort(Nums, "desc");
        for (int num: Nums) {
            System.out.println(num);
        }

    }
}
