package me.wydentis.movierecommendersystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] result = recommender.recommendMovies("Finding Glory");
        System.out.println(Arrays.toString(result));
//        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    }

}
