package practise;
import java.util.Arrays;

public class Array {
    public static void printArray (int[] array) {
        System.out.println("Elements:" + Array.toString(array));
    }

    private static String toString(int[] array) {
        return null;
    }

    public static void main (String[] args) {
        int [] num = {2,4,6,8,10};
        printArray(num);
    }

}
