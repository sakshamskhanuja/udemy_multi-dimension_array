import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initializing a 2D Array.
        int[][] array2 = new int[4][4];

        // Filling up a 2D Array.
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            int[] array = array2[i];
            for (int j = 0; j < array.length; j++) {
                array2[i][j] = random.nextInt(100);
            }
        }

        // Prints the elements of array2.
        System.out.println(Arrays.deepToString(array2));

        // Assigning a new array at 1st index containing 3 elements.
        array2[1] = new int[] {10, 20, 30};

        // Prints the elements of array2.
        System.out.println(Arrays.deepToString(array2));

        // Divider
        System.out.println("-".repeat(20));

        // Stores 3 Object.
        Object[] objectArray = new Object[3];

        // Prints elements of objectArray.
        System.out.println(Arrays.toString(objectArray));

        // Filling up the 0th index with a 1D String array.
        objectArray[0] = new String[] {"a", "b", "c"};

        // Prints elements of objectArray.
        System.out.println(Arrays.deepToString(objectArray));

        // Filling up the 1st index with a 2D String array.
        objectArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };

        // Prints elements of objectArray.
        System.out.println(Arrays.deepToString(objectArray));

        // Filling up the 2nd index with a 3D int array.
        objectArray[2] = new int[2][2][2];

        // Prints the objectArray.
        for (Object element : objectArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}