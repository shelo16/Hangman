package com.company;

public class Game{

    private String hits = "";
    private String misses = "";
    private int tries = 7;
    private String answer;

    public Game(String answer){
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter){
        boolean isHit = answer.indexOf(letter)!= -1;
        if (hits.indexOf(letter) != -1 || misses.indexOf(letter) != -1){
            System.out.println("You already tried that letter ! You have - " + tries + " tries left!");
        }else if (isHit){
            hits+=letter;
            System.out.println(letter + " is in the Word ! You have - " + tries + " tries left!");
        }
        else {
            tries = tries-1;
            misses += letter;
            System.out.println("There is no " + letter + " in the word . You have - " + tries + " tries left");
        }
        return isHit;
    }


    public String getCurrentProgress(){
        String progress = "";
        for (char letter : answer.toCharArray()){
            char display = '-';
            if (hits.indexOf(letter) != -1){
                display = letter;
            }
            progress += display;
        }
        return progress;
    }

    public int getTries(){
        return tries;
    }

    public String getAnswer(){
        return answer;
    }



}