package service;

import persistence.MemoryStoryRepository;
import persistence.StoryRepository;

import java.util.List;

public class PublicationService {
    private StoryRepository storyRepository = new MemoryStoryRepository();

    public void share(Story story) {
        storyRepository.save(story);
    }
}
