package web;

import service.FeedService;
import service.PublicationService;
import service.Story;

import java.util.List;

public class FeedController {
    FeedService feedService = new FeedService();
    PublicationService publicationService = new PublicationService();

    public void post(String story) {
        publicationService.share(new Story(story));
    }

    public List<Story> feed() {
        return feedService.fetchAllFeeds();
    }
}
