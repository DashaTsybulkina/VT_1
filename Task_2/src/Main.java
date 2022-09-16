import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.println(isInsideBounds(x,y));
    }

    private static boolean isInsideBounds(int x, int y){
        return ((y <= 5 && y>=0) && (x<= 4 && x>= -4)) || ((y < 0 && y>= -3) && (x<= 6 && x>= -6));
    }
}