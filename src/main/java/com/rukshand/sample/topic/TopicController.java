package com.rukshand.sample.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController{

    @Autowired
    private TopicController topicController;

    @GetMapping("/topics")
    public List<Topic> getAllToipcs(){
        return topicController.getAllToipcs();
    }
}
