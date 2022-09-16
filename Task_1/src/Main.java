import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();
        System.out.println(calculate(x,y));
    }

    private static double calculate(double x, double y){
        double numerator = 1+ Math.sin(x+y) * Math.sin(x+y);
        double denominator = 2 + Math.abs(x - 2*x/(1+x*x*y*y));
        return numerator/denominator +x;
    }
}