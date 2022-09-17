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
        numbers = shellSort(numbers);
        printArray(numbers);
    }

    static int[] shellSort(int[] array) {
        int i = 0;
        int temp;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = i == 0 ? 0 : i - 1;
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}