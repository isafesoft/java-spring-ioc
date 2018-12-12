package com.mk.springdemo;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    public SwimCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
