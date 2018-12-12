package com.mk.springdemo;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "The sad fortune";
    }
}
