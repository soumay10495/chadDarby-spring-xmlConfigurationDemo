package com.spring.xmlConfigurationDemo;

public class TrackCoach implements Coach {
    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        System.out.println("Inside TrackCoach constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Run for 30 mins";
    }

    @Override
    public String getFortune() {
        return "Track - " + fortuneService.getFortune();
    }
}
