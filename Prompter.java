package com.company;

import java.util.Scanner;

public class Prompter{

    private Game game;

    public Prompter(Game game){
        this.game = game;
    }

    public boolean promptForGuess(){
        Scanner scanner = new Scanner(System.in);
        while (game.getTries()>0){
            if (game.getCurrentProgress().equals(game.getAnswer())){
                System.out.println("Congrats , u guessed the word !");
                return true;
            }
            System.out.println("Enter letter : ");
            String input = scanner.nextLine();
            if (input.equals(game.getAnswer())){
                System.out.println("Congrats, you guessed the word !");
                return true;
            }
            char guessInput = input.charAt(0);
            game.applyGuess(guessInput);
            System.out.println(game.getCurrentProgress());
        }
        System.out.println("Sorry u lost, better luck next time! the word was - " + game.getAnswer());
        return true;
    }

}