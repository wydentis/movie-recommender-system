package me.wydentis.movierecommendersystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        String[] result = recommender.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(result));
        appContext.close();
    }

}
