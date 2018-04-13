package com.polytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import com.polytech.persistence.JdbcStoryRepository;
import com.polytech.persistence.StoryRepository;
import com.polytech.service.FeedService;
import com.polytech.service.PublicationService;
import com.polytech.web.FeedController;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class AppConfig {

    @Bean
    public StoryRepository storyRepository(DataSource dataSource) throws SQLException {
        return new JdbcStoryRepository(dataSource.getConnection());
    }

    @Bean
    public FeedService feedService(StoryRepository storyRepository){
        return new FeedService(storyRepository);
    }

    @Bean
    public PublicationService publicationService(StoryRepository storyRepository){
        return new PublicationService(storyRepository);
    }

    @Bean
    public FeedController feedController(FeedService feedService, PublicationService publicationService){
        return new FeedController(feedService,publicationService);
    }

    @Bean
    public JdbcStoryRepository jdbcStoryRepository(DataSource dataSource) throws SQLException {
        return new JdbcStoryRepository(dataSource.getConnection());
    }

    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                //.addScripts("schema.sql")
                .build();
    }
}
