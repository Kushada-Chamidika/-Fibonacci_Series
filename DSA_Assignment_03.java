package dsa_assignment_03;
/**
 *
 * @author 1999k
 */
public class DSA_Assignment_03 {

    int loopCount = 0;
    int num1 = 0, num2 = 1, num3 = 0;
    public int getValueForPosition(int position) {
        if (position > 0) {
            num3 = num1 + num2;
            if (loopCount == 0) {
                position = position - 2;
                loopCount++;
            }
            num1 = num2;
            num2 = num3;
            getValueForPosition(position - 1);
        }
        return num3;
    }

    int loopCountFib = 0;
    int num1Fib = 0, num2Fib = 1, num3Fib = 0;

    public void getFibonacciSeries(int position) {
        if (position > 0) {
            num3Fib = num1Fib + num2Fib;
            if (loopCountFib == 0) {
                System.out.print(num1Fib + " , " + num2Fib);
                position = position - 2;
                loopCountFib++;
            }
            num1Fib = num2Fib;
            num2Fib = num3Fib;
            System.out.print(" , " + num3Fib);
            getFibonacciSeries(position - 1);
        }
    }

    public static void main(String[] args) {

        DSA_Assignment_03 test = new DSA_Assignment_03();

        System.out.println("");
        System.out.println("Fibonacci Series...");
        test.getFibonacciSeries(15);

        System.out.println("");
        System.out.println("");

        System.out.println("Value Of The Given Position...");
        System.out.println(test.getValueForPosition(10));
        System.out.println("");

    }

}
