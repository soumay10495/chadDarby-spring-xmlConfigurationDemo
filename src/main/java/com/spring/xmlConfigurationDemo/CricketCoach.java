package com.spring.xmlConfigurationDemo;

public class CricketCoach implements Coach {
    FortuneService fortuneService;
    String emailAddress;
    String team;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside CricketCoach setter for FortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside CricketCoach setter for EmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside CricketCoach setter for Team");
        this.team = team;
    }

    @Override
    public String getWorkout() {
        return "Net practice for 30 mins";
    }

    @Override
    public String getFortune() {
        return "Cricket - " + fortuneService.getFortune();
    }
}
