import com.polytech.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.polytech.service.Story;

import com.polytech.web.FeedController;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

public class PublicationTest {


    private FeedController feedController;
    @Before
    public void init(){
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        feedController = container.getBean(FeedController.class);
    }

    @Test
    @Ignore
    public void should_post_story(){
        //GIVEN
        Story story = new Story("hi INFO4","dams");
        //FeedController feedController = new FeedController();

        //WHEN
        feedController.post(story);

        //THEN
      //  List<Story> postedStories = feedController.feed();
       // Assert.assertEquals(Arrays.asList(new Story("hi INFO4")), postedStories);
    }
}
