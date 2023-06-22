import javax.swing.*;
import java.util.Scanner;

public class main {
    private static final Scanner keyboardInput = new Scanner(System.in);

    public static void displayMainMenu() {


        String mainMenu = """
                Welcome to our Diary
                1 -> Create Diary
                2 -> Login
                3 -> Exit
                """;

        String userInput = input(mainMenu);

        switch (userInput.charAt(0)){
            case '1' -> createDiary();
            case '2' ->  exit();
            default -> displayMainMenu();

        }

    }

    private static void createDiary() {


    }
    private static void exit() {
    }

    private static void openDiaryMenu() {
        String menuItems = """
                Welcome to our Diary
                1 -> Create a Gist
                2 -> View Gist by Title
                3 -> Delete Gist by Title
                4 -> Update Gist
                3 -> Exit
                """;

        char userResponses = input(menuItems).charAt(0);
        switch (userResponses){
            case '1' -> createGist();
            case '2' -> viewGist();
            case '3' -> deleteGist();
            case '4' -> updateGist();
            case '5' -> exit();
            default -> openDiaryMenu();

        }

    }

    private static void createGist() {

    }

    private static void viewGist() {

    }

    private static void deleteGist() {

    }

    private static void updateGist() {

    }


    private static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public static String input(String prompt){
//        return JOptionPane.showInputDialog(prompt);
        display(prompt);
        return keyboardInput.nextLine();
    }

    }

