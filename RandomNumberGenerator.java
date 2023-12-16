//لتوليد أرقام عشوائية.
import java.util.Random;

    public class RandomNumberGenerator {
        public static void main(String[] args) {
            int a = 12;
            int b = 5;
            int n = 100;
            int seed = 92;

            int[] numbers = generateRandomNumbers(a, b, n, seed, 5);

            System.out.println("Next five pseudorandom numbers:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }

        public static int[] generateRandomNumbers(int a, int b, int n, int seed, int count) {
            Random random = new Random(seed);
            int[] numbers = new int[count];

            for (int i = 0; i < count; i++) {
                numbers[i] = (a * random.nextInt(n) + b) % n;
            }

            return numbers;
        }
    }


