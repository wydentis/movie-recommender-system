package me.wydentis.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private final Filter filter;

    @Autowired
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        return filter.getRecommendations(movie);
    }
}
