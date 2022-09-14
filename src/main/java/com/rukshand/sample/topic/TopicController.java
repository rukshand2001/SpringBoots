package com.rukshand.sample.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

public class TopicController {
    @RestController
    public class topicController{
        @RequestMapping("/Topics")
        public List<Topic> getAllTopics(){
            return Arrays.asList(
                    new Topic("Ruk","Rukshan","Kandy"),
                    new Topic("Ase","Asela","Kurunagala")
            );
        }
    }
}