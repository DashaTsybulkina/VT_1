import java.util.Random;

public class Main {
    final static int N  = 5;
    public static void main(String[] args){
        int[] array = new int[N];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200);
            System.out.print(array[i] +" ");
        }
        System.out.println();
        findPrimeNumbers(array);
    }

    private static void findPrimeNumbers(int[] array){
        boolean hasNumber = false;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])){
                System.out.println(array[i]+ "-" +(i+1));
                hasNumber = true;
            }
        }
        if (!hasNumber){
            System.out.println("В массиве  нет простых чисел");
        }
    }

    private static boolean isPrimeNumber(int number){
        if (number < 2)
            return false;

        if (number == 2 || number == 3)
            return true;

        for (int i = 2; i < number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }
}