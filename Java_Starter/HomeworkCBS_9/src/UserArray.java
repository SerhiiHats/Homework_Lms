import java.util.Arrays;
import java.util.Random;

public class UserArray {
    static int[] growthArray (int[] array) {
        int[] myGrowthArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            myGrowthArray[i] = array[i];
        }
        return myGrowthArray;
    }

    static int[] insertGrowthArray(int[] array, int insert) {
        int[] myInsertGrowthArray = new int[array.length + 1];
        myInsertGrowthArray[0] = insert;
        for (int i = 0; i < array.length; i++) {
            myInsertGrowthArray[i +1] = array[i];
        }
        return myInsertGrowthArray;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int lengthArray = 8;
        int[] array1 = new int[lengthArray];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(100);
        }
        System.out.println("1. Исходный массив                             = " + Arrays.toString(array1));
        array1 = growthArray(array1);
        System.out.println("2. Исходный массив и +1 к его размеру          = " + Arrays.toString(array1));
        array1 = insertGrowthArray(array1, 17);
        System.out.println("3. От предыдущего +1 к размеру и в mas[0] = 17 = " + Arrays.toString(array1));

    }
}
