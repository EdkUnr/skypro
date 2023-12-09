import java.util.Arrays;

public class Main {
    static int[] arr = new int[3];
    static {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
    }

    static double[] arr2 = {1.57, 7.654, 9.986};
    static int[] mass = {3, 4, 18, 23, 56, 31, 57};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(mass));

        printArrayInReverse(arr);
        printArrayInReverse(arr2);
        printArrayInReverse(mass);

        makeOddNumbersEven(arr);
        makeOddNumbersEven(mass);

    }

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArrayInReverse(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void makeOddNumbersEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
    }
}

