package persistence;

import service.Story;

import java.util.List;

public interface StoryRepository {

    public void save(Story content);
    public List<Story> fetch();
}
