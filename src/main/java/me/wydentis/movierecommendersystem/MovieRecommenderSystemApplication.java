package me.wydentis.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = context.getBean(RecommenderImplementation.class);
        String[] result = recommender.recommendMovies("Finding Glory");
        System.out.println(Arrays.toString(result));
    }

}
