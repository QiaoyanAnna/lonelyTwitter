package ca.ualberta.cs.lonelytwitter;

public class Joy extends Mood {
    private String message;

    public Joy (){
        this.message = "I am joy";
    }

    public String getMood(){
        return this.message;
    }

}

