package introducccion_a_java;

import java.util.Random;

public class Repetir_N_Numeros_N_Veces {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a random number between 1 and 19 for the number of iterations
        int iterations = random.nextInt(19) + 1;

        System.out.println("Random numbers will be generated " + iterations + " times.");

        for (int i = 0; i < iterations; i++) {
            // Generate a random number N between 1 and 19 for the quantity of numbers in this iteration
            int N = random.nextInt(19) + 1;

            // Generate N random numbers in the range of 18 to 65
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int j = 0; j < N; j++) {
                int randomNumber = random.nextInt(48) + 18; // 48 = (65 - 18 + 1)
                System.out.print(randomNumber + " ");
            }
            System.out.println(); // Line break after each iteration
        }
    }
}