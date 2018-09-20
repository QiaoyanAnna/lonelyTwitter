package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet
{
    public ImportantTweet(String message)
    {
        super(message);
    }

    public boolean isImportant()
    {
        return true;
    }

}
