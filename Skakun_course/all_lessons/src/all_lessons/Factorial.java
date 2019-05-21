package all_lessons;

public class Factorial {

    public static int getFactorial(int num){
        int factorial = 0;

        for(int i = num; i > 0; --i){
            factorial +=i;
        }

        return factorial;
    }

    public static void main(String[] args){
        System.out.println(getFactorial(5));
        System.out.println(getFactorial(10));
        System.out.println(getFactorial(255));
    }

}
