package com.company.springdemo;

import java.util.List;
import java.util.Map;

public class SessionPlanner {
    private Map<Integer, List<String>> topics;

    public Map<Integer, List<String>> getTopics() {
        return topics;
    }

    public void setTopics(Map<Integer, List<String>> topics) {
        this.topics = topics;
    }
}
