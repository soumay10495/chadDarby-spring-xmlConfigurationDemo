package com.spring.xmlConfigurationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationDemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = classPathXmlApplicationContext.getBean("coach", Coach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortune());


        CricketCoach cricketCoach = classPathXmlApplicationContext.getBean("cricket", CricketCoach.class);
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
        System.out.println(cricketCoach.getWorkout());
        System.out.println(cricketCoach.getFortune());

        classPathXmlApplicationContext.close();
    }

}
