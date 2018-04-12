package com.polytech.service;

import com.polytech.persistence.StoryRepository;

import java.util.List;

public class FeedService {
    StoryRepository storyRepository;

    public FeedService(StoryRepository storyRepository){
        this.storyRepository = storyRepository;
    }
    public List<Story> fetchAllFeeds() {
        return storyRepository.fetch();
    }
}
