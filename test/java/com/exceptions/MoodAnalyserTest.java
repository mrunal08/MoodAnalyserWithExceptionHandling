package com.exceptions;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void whenGivenAMessageAbilityToAnalyseAndRespondHappyOrSadMood_shouldReturnTrue(){

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
        System.out.println("This is sad message");

    }

    @Test
    public void whenGivenAnyMessageAbilityToAnalyseAndRespondHappy_shouldReturnFalse(){

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a message");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
        System.out.println("This is happy message");


    }



}
