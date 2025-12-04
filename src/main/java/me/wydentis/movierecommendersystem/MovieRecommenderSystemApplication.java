package me.wydentis.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        ContentBasedFilter filter = context.getBean(ContentBasedFilter.class);
        System.out.println(filter);

        Movie movie1 = filter.getMovie();
        Movie movie2 = filter.getMovie();
        Movie movie3 = filter.getMovie();

        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

        System.out.println("ContentBasedFilter instances: " + ContentBasedFilter.getInstances());
        System.out.println("Movie instances: " + Movie.getInstances());
    }

}
