package com.rukshand.sample.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("Ruk","Rukshan","Kandy"),
            new Topic("Ase","Asela","Kurunagala")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}
