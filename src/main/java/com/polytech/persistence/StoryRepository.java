package com.polytech.persistence;

import com.polytech.service.Story;

import java.util.List;

public interface StoryRepository {

    public void save(Story content);
    public List<Story> fetch();
}
