package javainheritance.Task1;

import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        Horse hest = new Horse();

        // Using user input to get info for Horse
        System.out.print("Please enter the name of the horse: ");
        hest.setName(input.nextLine());

        System.out.print("Please enter the color of the horse: ");
        hest.setColor(input.nextLine());

        System.out.print("Please enter the birth year of the horse: ");
        hest.setBirthYear(input.nextInt());
        input.nextLine();

        // Getting info for RaceHorse
        RaceHorse raceHest = new RaceHorse();
        System.out.print("Enter a name for the race horse: ");
        raceHest.setName(input.nextLine());

        System.out.print("Enter a color for the racehorse: ");
        raceHest.setColor(input.nextLine());

        System.out.print("Enter the birth year of the racehorse: ");
        raceHest.setBirthYear(input.nextInt());
        input.nextLine();

        System.out.print("Enter the amount of races the racehorse has completed: ");
        raceHest.setAmountOfRaces(input.nextInt());
        input.nextLine();

        input.close();

        System.out.print("Thanks for providing the horse info!");

        // Printing horse info
        System.out.println("Horse Details:");
        System.out.println("Name: " + hest.getName());
        System.out.println("Color: " + hest.getColor());
        System.out.println("Birth Year: " + hest.getBirthYear());

        // Printing racehorse info
        System.out.println("\nRaceHorse Details:");
        System.out.println("Name: " + raceHest.getName());
        System.out.println("Color: " + raceHest.getColor());
        System.out.println("Birth Year: " + raceHest.getBirthYear());
        System.out.println("Races Competed: " + raceHest.getAmountOfRaces());
    }
}
