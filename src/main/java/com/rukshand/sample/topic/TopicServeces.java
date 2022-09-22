package com.rukshand.sample.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicServeces {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("ASE","ASELA","S.Engineer"),
          new Topic("RUK","RUKSHAN","U.Graduate")
        ));

    public  List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
