package Lab2;

public class Calculator {

    static int fn_sum(int x, int y) {
        return (x+y);
        }

    static double fn_sum(double x, double y) {
        return (x+y);
    }

    static long fn_sum(long x, long y) {
        return (x+y);
    }

    static double fn_div(int x, int y) {
        double result = (double)x/y;
        x = (x-(int)(y*result));
        double i = 1;

        do {
            i = i*0.1;
            x = x*10;
            result = result+i*(double)(x/y);
            x = (x-(int)(x/y)*y);

            if(i <= 0.00001)
                break;
        }
        while (x != 0);
        return result;
    }

    static double fn_div(double x, double y) {
        double result = x/y;
        x = (x-(y*result));
        double i = 1;

        do {
            i = i*0.1;
            x = x*10;
            result = result+i*(x/y);
            x = (x-(int)(x/y)*y);

            if(i <= 0.00001)
                break;
        }
        while (x != 0);
        return result;
    }

    static double fn_div(long x, long y) {
        double result = (double)x/y;
        x = (x-(long)(y*result));
        double i = 1;

        do {
            i = i*0.1;
            x = x*10;
            result = result+i*(double)(x/y);
            x = (x-(int)(x/y)*y);

            if(i <= 0.00001)
                break;
        }
        while (x != 0);
        return result;
    }

    static int fn_minus(int x, int y) {
        return (x-y);
    }

    static double fn_minus(double x, double y) {
        return (x-y);
    }

    static long fn_minus(long x, long y) {
        return (x-y);
    }

    static int fn_multiply(int x, int y) {
        return (x*y);
    }

    static double fn_multiply(double x, double y) {
        return (x*y);
    }

    static long fn_multiply(long x, long y) {
        return (x*y);
    }
}


