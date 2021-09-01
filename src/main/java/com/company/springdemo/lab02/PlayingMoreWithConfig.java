package com.company.springdemo.lab02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class PlayingMoreWithConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:lab02-topics.xml");
        Conference conference = (Conference) applicationContext.getBean("conference");
        Map<Integer, List<String>> topics = conference.getSessionPlanner().getTopics();
        System.out.println(topics.get(45));
        System.out.println(topics.get(50));
        System.out.println(topics.get(60));
    }
}
