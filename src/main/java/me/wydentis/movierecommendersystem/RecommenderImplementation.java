package me.wydentis.movierecommendersystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("dependency injection via setter");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct called");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy called");
    }
}
