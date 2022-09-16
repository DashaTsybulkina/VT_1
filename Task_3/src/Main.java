public class Main {
    public static void main(String[] args) {
        calculateAndPrint(3, 5, 1);
        calculateAndPrint(7, 145, 5);
    }

    static void calculateAndPrint(int a, int b, double h) {
        double current = a;
        System.out.printf("%5cx%4c|%4cF(x)%3c\n", ' ', ' ', ' ', ' ');
        double result;
        do {
            result = Math.tan(current);
            System.out.printf("%10f|%10f\n", current, result);
            current += h;
        } while (current <= b);
    }
}