package com.mk.springdemo;

public class TruckCoach implements Coach {
    private FortuneService fortuneService;

    public TruckCoach(FortuneService fortuneService) {
       this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do IT" + this.fortuneService.getFortune();
    }
}
