import java.util.Random;

public class Main {
    final static int N = 5;

    public static void main(String[] args) {
        int[] numbers = new int[N];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int[][] matrix =fillMatrix(numbers);
        printMatrix(matrix);
    }

    public static int[][] fillMatrix(int[] numbers){
        int[][] matrix = new int[numbers.length][numbers.length];
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp = (i + j) % matrix.length;
                matrix[i][j] = numbers[temp];
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        System.out.println("Последовательность:");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}