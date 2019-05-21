package all_lessons;

public class home_task {

    public static void main(String[] args) {
        //task 0
        //varables
        int intNumA = 5;
        int intNumB = 98;
        double doubleNum = 123.325;
        float floatNum = 234.3f;
        long longNum = 52398945l;

        //task 1
        //addition
        int res = intNumA + intNumB;
        System.out.println("Addition result of a + b is: " + res);

        //subtraction
        res = intNumB - intNumA;
        System.out.println("Subtraction result of intNumB - intNumA is: " + res);

        //muliplication
        res = intNumA * intNumB;
        System.out.println("Muliplication result of intNumB * intNumA is: " + res);

        //division
        res = intNumA / intNumB;
        System.out.println("Division result of intNumB / intNumA is: " + res);

        //division by modulus
        res = intNumA % intNumB;
        System.out.println("Division result of intNumB % intNumA is: " + res);

        //task 2
        //abbreviated addition
        System.out.println("Abbreviated addition : intNumA+=intNumB " + (intNumA+=intNumB));
        //abbreviated subtraction
        System.out.println("Abbreviated subtraction: intNumB - intNumA "+ (intNumB -= intNumA));
        //abbreviated multiplication
        System.out.println("Abbreviated multiplication: intNumB * intNumA " + (intNumB *= intNumA));
        //Abbreviated divisoin
        System.out.println("Abbreviated division: " + (intNumB /= 2));
        //Abbreviated mod division
        System.out.println("Abbreviated mod division: " + (intNumA %= 5));

        //task3
        //Overflow Max Integer and postfixed increment
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max++;
        System.out.println(max + " Overflowing of the max integer value");
        /*
        представление signed int :
        самый правый бит - бит знака, значение 0 представляет положительные значения, 1 представляет отрицательные.
        остальные биты - значение числа.
        Отрицательные числа: инверсное значение положительного числа +1
        Например, 0000 0010B (2D)
                  1111 1101+1 -> 1111 1110B (-2D)
        */

        //task4
        //prefixed increment
        ++max;
        System.out.println(max);
        //postfixed decrement
        max--;
        System.out.println(max);
        //prefied decrement
        --max;
        System.out.println(max);


        //task 5
        if(intNumA>100) {
            System.out.println("intNumA > 100");
        }
        else if(intNumA<100){
            System.out.println("intNumA < 100");
        }else{
            System.out.println("intNumA = 0");
        }

        boolean result = intNumA>100;
        if(intNumA>100) {
            System.out.println("intNumA > 100");
        }

        //task 6
        /*Почему boolean size  is a byte? ну судя по ответам на stackexchange, размер не байт, а 4 байта(32) или 8 байт(64 бит),
        так как boolean  обрабатываются jvm как int со значениями 0 и 1*/

    }


}
