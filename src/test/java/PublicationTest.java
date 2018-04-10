import org.junit.Assert;
import org.junit.Test;
import service.Story;

import web.FeedController;

import java.util.Arrays;
import java.util.List;

public class PublicationTest {

    @Test
    public void should_post_story(){
        //GIVEN
        String story = "hi INFO4";
        FeedController feedController = new FeedController();

        //WHEN
        feedController.post(story);

        //THEN
        List<Story> postedStories = feedController.feed();
        Assert.assertEquals(Arrays.asList(new Story("hi INFO4")), postedStories);
    }
}
