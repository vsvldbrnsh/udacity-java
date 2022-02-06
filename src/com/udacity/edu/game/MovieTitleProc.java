package com.udacity.edu.game;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;

class MovieTitleProc {
    private String filename;
    private String movieTitle;
    private ArrayList<String> moviesContainer;

    MovieTitleProc(String filename){
        this.filename = filename;
        this.moviesContainer = new ArrayList<String>();
    }

    public void fillContainer(){
        try {
            File file = new File(filename);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                moviesContainer.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getRandomTitle(){
        int size = moviesContainer.size()-1;
        int rand = new Random().nextInt(size - 1 + 1) + 1;
        return moviesContainer.get(rand);
    }

    public String getFilename(){
        return filename;
    }
}

