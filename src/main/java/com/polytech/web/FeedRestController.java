package com.polytech.web;

import com.polytech.service.FeedService;
import com.polytech.service.PublicationService;
import com.polytech.service.Story;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedRestController {

    private FeedService feedService;
    private PublicationService publicationService;

    public FeedRestController(FeedService feedService, PublicationService publicationService) {
        this.feedService = feedService;
        this.publicationService = publicationService;
    }

    @RequestMapping(value = "/rest/feed",method = RequestMethod.GET)
    public List<Story> stories(){
        List<Story> stories = feedService.fetchAllFeeds();
        return stories;
    }

    @RequestMapping(value = "/rest/feed", method = RequestMethod.POST)
    public Story post(@RequestBody Story story) {
        publicationService.share(story);
        return story;
    }
}
