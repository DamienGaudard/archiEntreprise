package com.polytech.service;

import com.polytech.persistence.StoryRepository;

public class PublicationService {
    private StoryRepository storyRepository;

    public PublicationService(StoryRepository storyRepository){
        this.storyRepository = storyRepository;
    }
    public void share(Story story) {
        storyRepository.save(story);
    }
}
