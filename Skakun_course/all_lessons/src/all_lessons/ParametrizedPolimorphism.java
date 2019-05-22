package all_lessons;

public class ParametrizedPolimorphism {
    static int Foo(){
        return 2+3;
    }

    static int Foo(int a, int b){
        return a + b;
    }

    static String Foo(int a, int b, String name){
        int result = a + b;
        String msg = name + " added a + b and got result = " + result;
        return msg;
    }

    public static void main(String[] args){

        System.out.println(Foo());
        System.out.println(Foo(4,6));
        System.out.println(Foo(23, 65, "Greekk"));

    }

}
