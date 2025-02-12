package introducccion_a_java;

import java.util.Scanner;

public class Tipos_Datos_Relacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your lastname: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter one float number: ");


        float num3 = scanner.nextFloat();
        float sum = num1 + num2 + num3;

        System.out.println("\n" + name + " " + lastName + ": \n" +
                "The sum of the three numbers is: " + sum);

        if (num1 > num2){
            System.out.println("The integer number " + num1 + " is greater than " + num2);
        } else if (num2 > num1){
            System.out.println("The integer number " + num2 + " is greater than " + num1);
        } else {
            System.out.println("The integer number " + num1 + " is equal to " + num2);
        }

        float div = (num1 * num2) / num3;
        System.out.println("The division of " + num1 + " plus " + num2 + " over " + num3 + " is "+ div);

    }
}