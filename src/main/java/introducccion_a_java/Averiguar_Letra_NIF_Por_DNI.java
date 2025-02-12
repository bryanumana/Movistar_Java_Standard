package introducccion_a_java;

import java.util.Scanner;

public class Averiguar_Letra_NIF_Por_DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of letters for NIF calculation
        char[] letters = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        // Ask the user to enter a valid DNI number
        System.out.print("Enter a valid DNI number (without the letter): ");
        int dni = sc.nextInt();
        sc.close();

        // Calculate the index to get the NIF letter
        int index = dni % 23;

        // Get the corresponding letter from the array
        char nifLetter = letters[index];

        // Form the complete NIF (DNI + letter)
        String nif = String.valueOf(dni + "-" + nifLetter);

        // Display the resulting NIF
        System.out.println("The corresponding NIF is: " + nif);

    }
}




