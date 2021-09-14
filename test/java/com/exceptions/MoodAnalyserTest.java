package com.exceptions;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
   @Test
    public void anaylseTest() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
       System.out.println("This is sad message");

    }
    @Test
    public void givenHappyMessageshouldReturnHappyMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void whenGivenNullMessage_shouldThrowException() {
       try {
           MoodAnalyser moodAnalyser = new MoodAnalyser();
           String mood = moodAnalyser.analyseMood();
       }
        catch (MoodAnalysisException moodAnalysisException){
           Assert.assertEquals("Invalid Message", moodAnalysisException.getMessage());

        }


    }


}