package com.spring.xmlConfigurationDemo;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private ArrayList<String> fortuneList;

    public HappyFortuneService() {
        System.out.println("Inside HappyFortuneService constructor");
        fortuneList = new ArrayList<>();
        fortuneList.add("Today is your lucky day");
        fortuneList.add("Today is going to be difficult for you");
        fortuneList.add("Today will be a new experience for you");
        fortuneList.add("Today you will learn a lot");
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        int index = random.nextInt(4);
        return fortuneList.get(index);
    }
}
