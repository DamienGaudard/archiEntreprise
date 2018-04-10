package service;

import persistence.MemoryStoryRepository;
import persistence.StoryRepository;

import java.util.List;

public class FeedService {
    StoryRepository storyRepository = new MemoryStoryRepository();

    public List<Story> fetchAllFeeds() {
        return storyRepository.fletch();
    }
}
