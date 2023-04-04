package com.BridgeLabz;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }
    public String analyseability(){
        if (message.contains("sad"))
            return "Sad";
            return "Happy";
        }
}
