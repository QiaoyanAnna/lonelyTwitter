package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood (){
        this.date = new Date();
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

}
