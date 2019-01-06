import twodimentionalshapes.*;
import threedimensionalshapes.*;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    private static boolean playAgain() {
        System.out.println("\nWould you like to play again? Y/N:");
        char c = scan.nextLine().toLowerCase().charAt(0);
        if (c == 'n') {
            return false;
        } else if (c == 'y') {
            return true;
        }
        System.out.println("Invalid response, try again");
        return playAgain();
    }

    private static boolean isValidDimension(String dimensionCheck) {
        if (dimensionCheck.equals("2d") || dimensionCheck.equals("3d")) {
            return true;
        }
        System.out.println("Invalid dimension, try again.");
        return false;
    }

    private static void playShape(String s) {
        if (s.equals("2d")) {
            TwoDimShape.play();
        } else {
            ThreeDimShape.play();
        }
    }

    public static void main(String[] args) {
        boolean play;

        do {
            System.out.println("Welcome to my program");

            boolean isValidAnswer = false;
            String answer = "";


            while (!isValidAnswer) {
                System.out.println("Would you like to analyse a 2D or 3D shape:");
                answer = scan.nextLine().trim().toLowerCase();
                isValidAnswer = isValidDimension(answer);

            }

            playShape(answer);
            play = playAgain();

            System.out.println();
        } while (play == true);
        System.out.println("User ended program.");
    }
}
