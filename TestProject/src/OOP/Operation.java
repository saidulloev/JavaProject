package OOP;

public class Operation {


    static int findFactorial(int num){

        int factorial = 1;

        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }

    static int sum(int x, int y){
        return x + y;
    }

    static int mult(int x, int y){
        return x * y;
    }

    static float div(float x, float y){
        return x/y;
    }
}
