package com.spring.xmlConfigurationDemo;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        System.out.println("Inside BasketballCoach constructor");
        this.fortuneService = fortuneService;
    }

    private void init() {
        System.out.println("Inside BasketballCoach init method");
    }

    private void destroy() {
        System.out.println("Inside BasketballCoach destroy method");
    }

    @Override
    public String getWorkout() {
        return "Play for 30 mins";
    }

    @Override
    public String getFortune() {
        return "Basketball - " + fortuneService.getFortune();
    }
}
