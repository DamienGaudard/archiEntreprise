package com.polytech.persistence;

import com.polytech.service.Story;
import com.polytech.service.User;

import java.security.Principal;
import java.util.List;

public interface StoryRepository {

    void save(Story content);
    List<Story> fetch(Principal principal);

    void remove(String content, Principal principal);

    void edit(String newContent, String content, Principal principal);
}
