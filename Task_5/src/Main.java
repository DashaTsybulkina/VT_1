import java.util.Random;

public class Main {
    final static int N = 5;

    public static void main(String[] args) {
        int[] array = new int[N];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nВозрастающая последовательность:");
        int[] seq = getLongestIncreasingSequence(array);
        for (int j : seq) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Можно удалить " + (array.length - seq.length));
    }

    private static int[] getLongestIncreasingSequence(int[] array) {
        final int N = array.length;
        int[] P = new int[N];
        int[] M = new int[N + 1];

        int L = 0;
        for (int i = 0; i < N; ++i) {
            int lo = 1;
            int hi = L + 1;
            while (lo < hi) {
                int mid = lo + (int) Math.floor((hi - lo) / 2.0);
                if (array[M[mid]] < array[i])
                    lo = mid + 1;
                else
                    hi = mid;
            }
            int newL = lo;

            P[i] = M[newL - 1];
            M[newL] = i;

            if (newL > L)
                L = newL;
        }
        int[] S = new int[L];
        int k = M[L];
        for (int i = L - 1; i >= 0; --i) {
            S[i] = array[k];
            k = P[k];
        }
        return S;
    }
}