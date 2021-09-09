package com.exceptions;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
   @Test
    public void whenGivenAMessageAbilityToAnalyseAndRespondHappyOrSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a message");

        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));

    }


}
