package GrassOpgave3;

import java.util.Scanner;

public class Grass {

    public int daysUntilMowingTheLawn(double currentGrassLength, double maximumGrassLength){
        double growthPerDay = 0.8;
        int days = 0;

        for (int i = 0; i <= maximumGrassLength; i++) {
            if (currentGrassLength < maximumGrassLength){
                currentGrassLength = currentGrassLength + growthPerDay;
                days++;
            }

        }

        return days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grass grass = new Grass();

        System.out.println("Please type your current grass length: ");
        double currentGrassLengthInput = scanner.nextDouble();

        System.out.println("Please type your maximum grass length: ");
        double maximumGrassLengthInput = scanner.nextDouble();

        int daysUntilMowingOfLawn = grass.daysUntilMowingTheLawn(currentGrassLengthInput, maximumGrassLengthInput);
        System.out.println("Days until you have to cut the lawn: " + daysUntilMowingOfLawn);

    }
}
