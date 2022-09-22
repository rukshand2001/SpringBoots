package com.rukshand.sample.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController{

    @Autowired
    private TopicServeces topicServeces;
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicServeces.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String topic_id){
        return topicServeces.getTopic(topic_id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicServeces.addTopic(topic);
    }
}
