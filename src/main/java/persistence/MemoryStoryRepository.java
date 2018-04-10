package persistence;

import service.Story;

import java.util.ArrayList;
import java.util.List;

public class MemoryStoryRepository implements StoryRepository {
    private static List<Story> dataBase = new ArrayList();

    public void save(Story content){
        dataBase.add(content);
    }

    public List<Story> fetch(){
        return dataBase;
    }
}
