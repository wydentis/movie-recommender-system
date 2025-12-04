package me.wydentis.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        System.out.println(appContext.containsBean("collaborativeFilter") ? "found" : "not found");
        System.out.println(appContext.containsBean("contentBasedFilter") ? "found" : "not found");
    }

}
