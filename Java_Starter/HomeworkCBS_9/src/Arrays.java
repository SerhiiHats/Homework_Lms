public class Arrays {
    static void printReverseArray (int[] array) {
        for (int i = (array.length - 1); 0 <= i; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.print("1. Исходный массив          = ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();
        System.out.print("2. Вывод в обратном порядке = ");
        printReverseArray(myArray);
    }

}
