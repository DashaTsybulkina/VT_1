public class Main {
    public static void main(String[] args) {
        int[] firstArray = {-1,2,4,6,9,10,20};
        int[] secondArray = {2,4,11,22};
        printArray(firstArray);
        printArray(secondArray);
        findPlaceToInsert(firstArray,secondArray);
    }

    public static void findPlaceToInsert(int[] array1, int[] array2){
        int j = 0;
        int i = 0;
        while ((i<array2.length) && (j<array1.length)) {
            if (array1[j]>= array2[i]){
                System.out.println("Элемент " + array2[i]+ " нужно вставить перед " +(j+1) +" элементом");
                i++;
            } else {
                j++;
            }
        }
        if (i < array2.length) {
            System.out.println("Остальные элементы нужно вставить в конце");
        }

    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}