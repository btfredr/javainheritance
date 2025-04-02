package javainheritance.Task1;

import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        // Defining a new horse
        Scanner input = new Scanner(System.in);
        Horse hest = new Horse();

        System.out.println("Please enter the name of the horse: ");
        hest.setName(input.nextLine());

        System.out.println("Please enter the color of the horse: ");
        hest.setColor(input.nextLine());

        System.out.println("Please enter the birth year of the horse: ");
        hest.setBirthYear(input.nextInt());

        
    }
}
