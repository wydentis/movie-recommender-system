package me.wydentis.movierecommendersystem;

import org.springframework.beans.factory.annotation.Qualifier;

public class RecommenderImplementation {
    private final Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        return filter.getRecommendations(movie);
    }
}
