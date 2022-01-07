import java.util.Scanner;
public class Fibonac{
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);

        int X=x.nextInt();

        System.out.println(Fibonacci(X));
    }

    static int Fibonacci(int X)
    {
        if (X == 0)	return 0;
        if (X == 1)	return 1;
        return Fibonacci(X - 1) + Fibonacci(X - 2);
    }
}
