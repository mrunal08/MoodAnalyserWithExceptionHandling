package com.exceptions;

import com.exceptions.MoodAnalysisException;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {

        try {
            if (this.message.contains("sad"))
                return "SAD";
                return "HAPPY";

        } catch (NullPointerException nullPointerException) {
            throw new MoodAnalysisException("Invalid Message");
        }

    }
    }


