package src.Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// this logger gets sent events and logs them to an ArrayList, it also writes what happens each game to a file
public class Logger {

    //used for naming of file
    int game;

    String gameType;

    ArrayList<String> log = new ArrayList<>();

    public Logger(){}
    public Logger(String gameType, int game){
        this.game = game;
        this.gameType = gameType;
    }

    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void writeToFile(String gameType, int game){
        try {
            String fileName = "Log-"+gameType+" game "+game+".txt";
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(fileName, true);
            for (String item: log){
                writer.write(item);
                writer.write('\n');
            }
            writer.write("**************************\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
