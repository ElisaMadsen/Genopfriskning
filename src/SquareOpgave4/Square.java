package SquareOpgave4;

import java.util.Scanner;

public class Square {

    public void printSquare(int number, String sign) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(" " + sign + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Square square = new Square();

        System.out.println("Please type in a number: ");
        int numberInput = scanner.nextInt();

        System.out.println("Please type in a sign you want to make a square with: ");
        String signInput = scanner.next();

        System.out.println("Here is your square 😎");
        square.printSquare(numberInput, signInput);




    }
}
