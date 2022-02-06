package com.udacity.edu.game;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        MovieTitleProc mv  = new MovieTitleProc("data/movies.txt");
        mv.fillContainer();
        String title = mv.getRandomTitle();

        Encoder encode = new Encoder();
        encode.encodeTitle(title);

        int attempt = 10;
        int errors = 0;
        boolean isWinner = false;
        String wrongLetters = "";
        Scanner input = new Scanner(System.in);

        while(attempt>0){
            if(encode.compareStings(encode.getTitleHidden(),title)){
                isWinner=true;
                break;
            }

            System.out.println("You are guessing "+ encode.getTitleHidden());
            System.out.println("You have guessed("+errors+") wrong letters :" + wrongLetters);
            System.out.println("Guess a letter: ");
            String letter = input.nextLine();

            if(title.indexOf(letter)!= -1){
                System.out.println("cool the letter:" + letter + " is a right letter");
                encode.recompileHiddenTitle(title,letter);
                System.out.println("---------------------------------");

            }else{
                errors++;
                wrongLetters += " "+letter;
                attempt--;
                System.out.println("---------------------------------");
            }
        }

        if(isWinner){
            System.out.println("You win");
            System.out.println("You have guessed \'" + title + "\' correctly");
        }else{
            System.out.println("Sorry, you lost!");
            System.out.println("film title: " + title);
        }
    }
}