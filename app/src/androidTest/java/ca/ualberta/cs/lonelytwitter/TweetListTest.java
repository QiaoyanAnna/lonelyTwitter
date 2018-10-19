/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    //JUnit test method for adding tweet into Tweetlist
    public void testAddTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        Tweet retrievedTweet = tweetList.getTweet(0);

        assertEquals(retrievedTweet.getMessage(), tweet.getMessage());
        assertEquals(retrievedTweet.getDate(), tweet.getDate());
    }

    //Junit test method for checking whether a tweet is in the TweetList
    public void testHasTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertFalse(tweetList.hasTweet(tweet));

        tweetList.add(tweet);
        assertTrue((tweetList.hasTweet(tweet)));
    }

    public void testGetCount(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("first");
        tweetList.add(tweet);
        tweet = new NormalTweet("second");
        tweetList.add(tweet);
        assertEquals(tweetList.getCount(),2);
    }

    public void testDeleteTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("one for delete");

        tweetList.add(tweet);
        tweetList.delete(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testAddDuplicateTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);
        tweetList.add(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testGetTweets() {
        //assertTrue(Boolean.FALSE);
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("first");
        tweetList.add(tweet);
        Tweet tweet2 = new NormalTweet("second");
        tweetList.add(tweet);

        assertEquals(tweet2, tweetList.getTweets().get(0));
        assertEquals(tweet, tweetList.getTweets().get(1));
        //assertEquals(tweet.getMessage(), tweetList().get(0));
        //assertEquals(tweet2.getMessage(), tweetList.getTweets(1));


        //assertTrue(tweetList.hasTweet(tweet));
    }

}
