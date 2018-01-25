package com.company;

import java.util.Scanner;

public class Main{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Word : ");
        String input = scanner.nextLine();
        System.out.println("Enter description of that word: ");
        String description = scanner.nextLine();
        System.out.println(description);
        Game game = new Game(input);
        Prompter prompter = new Prompter(game);
        prompter.promptForGuess();
    }

    //need to add invalid inputs e.g : Integer, integer + String value  , signs - e.g : @, #, % .  ETC. ETC.
}