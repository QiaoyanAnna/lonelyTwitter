package ca.ualberta.cs.lonelytwitter;

public class Depressed extends Mood {
    private String message;

    public Depressed (){
        this.message = "I am Depressed";
    }

    public String getMood(){
        return this.message;
    }

}

