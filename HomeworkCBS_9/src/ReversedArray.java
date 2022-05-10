import java.util.Arrays;
import java.util.Random;

public class ReversedArray {
    static int[] myReverse(int[] array) {
        int[] arrayReverse = new int[array.length];
        int lengthArrayReverse = array.length;
        for (int i = 0; i < array.length; i++) {
            lengthArrayReverse--;
            arrayReverse[lengthArrayReverse] = array[i];
        }
        return arrayReverse;
    }

    static int [] subArray(int[] array, int index, int count) {
        int[] cutArray = new int[count];
        int j = 0;

        for (int i = (index - 1); i < (index + count -1); i++) {
            if (array.length > i) {
                cutArray[j] = array[i];
            } else {
               cutArray[j] = 1;
            }
            j++;
        }
        return  cutArray;
    }

    public static void main(String[] args) {
        int razmerMas = 8;
        int[] massiv1 = new int[razmerMas];
        Random rnd = new Random();
        for (int i = 0; i < massiv1.length; i++) {
            massiv1[i] = (rnd.nextInt(200) - 100);
        }
        System.out.println("1. Исходный массив (Random) чисел        = " + Arrays.toString(massiv1));
        massiv1 = myReverse(massiv1);
        System.out.println("2. Инвентированнный масив от исходного   = " + Arrays.toString(massiv1));
        int pozichMassiv2 = 5;
        int lenghtMassiv2 = 10;
        int [] massiv2 = subArray(massiv1, pozichMassiv2, lenghtMassiv2);
        System.out.println("3. Часть массива с позиции: " + pozichMassiv2 + " длиной: " + lenghtMassiv2 + " = " + Arrays.toString(massiv2));
    }
}
