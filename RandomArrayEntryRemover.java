import java.util.Random;
public class RandomArrayEntryRemover {
    public static void main(String[] args) {
        // Create an array with some entries
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Call the method to remove random entries
        removeRandomEntries(array);

        // Print the modified array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void removeRandomEntries(Object[] array) {
        Random random = new Random();
        int arrayLength = array.length;

        // Iterate through the array
        for (int i = 0; i < arrayLength; i++) {
            // Generate a random index within the remaining entries
            int randomIndex = random.nextInt(arrayLength - i);

            // Swap the current entry with the randomly selected entry
            Object temp = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}

